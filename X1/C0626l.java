package X1;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.C1337c;
import com.mobile.gro247.utility.restservice.RESTServiceFilePath;
import java.util.HashMap;
import t2.C1988a;

/* renamed from: X1.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0626l implements com.google.android.play.core.splitinstall.internal.B {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7073a;

    public C0626l(C0623i c0623i) {
        this.f7073a = c0623i;
    }

    public static void a(C1988a c1988a, com.google.firebase.crashlytics.internal.settings.h hVar) {
        String str = hVar.f14617a;
        if (str != null) {
            c1988a.c("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        c1988a.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c1988a.c("X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.4");
        c1988a.c("Accept", "application/json");
        String str2 = hVar.f14618b;
        if (str2 != null) {
            c1988a.c("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = hVar.f14619c;
        if (str3 != null) {
            c1988a.c("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = hVar.f14620d;
        if (str4 != null) {
            c1988a.c("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((C1337c) hVar.f14621e.c()).f14199a;
        if (str5 != null) {
            c1988a.c("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(com.google.firebase.crashlytics.internal.settings.h hVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", hVar.f14623h);
        hashMap.put("display_version", hVar.g);
        hashMap.put(RESTServiceFilePath.SOURCE, Integer.toString(hVar.i));
        String str = hVar.f14622f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // com.google.android.play.core.splitinstall.internal.B
    public Object zza() {
        O b6 = O.b(((C0623i) this.f7073a).f7070a);
        if (b6 != null) {
            return b6;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public C0626l(String str, H3.c cVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f7073a = str;
    }
}
