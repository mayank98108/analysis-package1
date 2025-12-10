package X1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class J {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.android.play.core.splitinstall.internal.N f7028c = new com.google.android.play.core.splitinstall.internal.N("SplitInstallInfoProvider");

    /* renamed from: a, reason: collision with root package name */
    public final Context f7029a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7030b;

    public J(Context context) {
        this.f7029a = context;
        this.f7030b = context.getPackageName();
    }

    public static boolean c(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final HashSet d(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        Iterator it = e(packageInfo).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!c(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final HashSet e(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        com.google.android.play.core.splitinstall.internal.N n = f7028c;
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                n.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            n.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            n.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        H h4 = (H) I.f7027a.get();
        if (h4 != null) {
            hashSet.addAll(h4.zza());
        }
        return hashSet;
    }

    @Nullable
    public final E a(@Nullable Bundle bundle) {
        E e6 = null;
        com.google.android.play.core.splitinstall.internal.N n = f7028c;
        if (bundle == null) {
            n.e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = bundle.getInt("com.android.vending.splits");
        if (i == 0) {
            n.e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            XmlResourceParser xml = this.f7029a.getResources().getXml(i);
            D d6 = new D();
            while (xml.next() != 1) {
                try {
                    if (xml.getEventType() == 2) {
                        if (xml.getName().equals("splits")) {
                            while (xml.next() != 3) {
                                if (xml.getEventType() == 2) {
                                    if (xml.getName().equals("module")) {
                                        String a6 = y.a("name", xml);
                                        if (a6 != null) {
                                            while (xml.next() != 3) {
                                                if (xml.getEventType() == 2) {
                                                    if (xml.getName().equals("language")) {
                                                        while (xml.next() != 3) {
                                                            if (xml.getEventType() == 2) {
                                                                if (xml.getName().equals("entry")) {
                                                                    String a7 = y.a("key", xml);
                                                                    String a8 = y.a("split", xml);
                                                                    y.b(xml);
                                                                    if (a7 != null && a8 != null) {
                                                                        d6.a(a6, a7, a8);
                                                                    }
                                                                } else {
                                                                    y.b(xml);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        y.b(xml);
                                                    }
                                                }
                                            }
                                        } else {
                                            y.b(xml);
                                        }
                                    } else {
                                        y.b(xml);
                                    }
                                }
                            }
                        } else {
                            y.b(xml);
                        }
                    }
                } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                }
            }
            e6 = d6.b();
            if (e6 == null) {
                n.e("Can't parse languages metadata.", new Object[0]);
            }
            return e6;
        } catch (Resources.NotFoundException unused2) {
            n.e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final HashSet b() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f7029a.getPackageManager().getPackageInfo(this.f7030b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f7028c.b("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        return (packageInfo == null || packageInfo.applicationInfo == null) ? new HashSet() : d(packageInfo);
    }
}
