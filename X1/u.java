package X1;

import N1.C0578m;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.C1240f;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.android.play.core.splitinstall.internal.N f7087c = new com.google.android.play.core.splitinstall.internal.N("SplitInstallService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f7088d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final String f7089a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public final C1240f f7090b;

    public u(Context context, String str) {
        String str2;
        this.f7089a = str;
        com.google.android.play.core.splitinstall.internal.N n = com.google.android.play.core.splitinstall.internal.x.f13206a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    com.google.android.play.core.splitinstall.internal.x.f13206a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        str2 = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str2 = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str2)) {
                        String str3 = Build.TAGS;
                        if ((!str3.contains("dev-keys") && !str3.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str2)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.f7090b = new C1240f(applicationContext != null ? applicationContext : context, f7087c, f7088d);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle a(com.google.android.play.core.splitinstall.internal.H h4) {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) h4.f13153a).iterator();
        while (it.hasNext()) {
            com.google.android.play.core.splitinstall.internal.J j6 = (com.google.android.play.core.splitinstall.internal.J) it.next();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", j6.a());
            bundle2.putLong("event_timestamp", j6.b());
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList));
        return bundle;
    }

    public static N1.L b() {
        f7087c.b("onError(%d)", -14);
        return C0578m.d(new SplitInstallException(-14));
    }
}
