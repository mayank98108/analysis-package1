package X1;

import L3.O1;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.appevents.e;
import com.google.android.play.core.assetpacks.k1;
import com.unbxd.sdk.internal.enums.CategoryType;
import com.unbxd.sdk.internal.enums.ReferenceType;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class K implements com.google.android.play.core.splitinstall.internal.B, P1.m, InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7031a;

    public /* synthetic */ K(Object obj) {
        this.f7031a = obj;
    }

    @Override // P1.m
    public /* bridge */ /* synthetic */ Object a() {
        return new k1((com.google.android.play.core.assetpacks.F) ((P1.m) this.f7031a).a());
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        J.a aVar = (J.a) this.f7031a;
        if (E0.a.b(this)) {
            return;
        }
        try {
            if (i == 0) {
                try {
                    ReferrerDetails a6 = aVar.a();
                    Intrinsics.checkNotNullExpressionValue(a6, "{\n                      …rer\n                    }");
                    String string = a6.f9469a.getString("install_referrer");
                    if (string != null) {
                        if (!kotlin.text.p.t(string, "fb", false)) {
                            if (kotlin.text.p.t(string, "facebook", false)) {
                            }
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = com.facebook.appevents.e.f10116c;
                        com.facebook.f.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", string).apply();
                    }
                    com.facebook.f.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                } catch (RemoteException | Exception unused) {
                    return;
                }
            } else if (i == 2) {
                com.facebook.f.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            }
            aVar.f1154a = 3;
            if (aVar.f1157d != null) {
                Log.isLoggable("InstallReferrerClient", 2);
                aVar.f1155b.unbindService(aVar.f1157d);
                aVar.f1157d = null;
            }
            aVar.f1156c = null;
        } catch (Throwable th) {
            E0.a.a(this, th);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.B
    public Object zza() {
        return new J(((C0623i) ((O1) this.f7031a).f3521a).f7070a);
    }

    public K(J.a aVar, e.a.C0103a c0103a) {
        this.f7031a = aVar;
    }

    public K(String categoryPath) {
        Intrinsics.checkNotNullParameter(categoryPath, "categoryPath");
        ReferenceType referenceType = ReferenceType.None;
        CategoryType categoryType = CategoryType.None;
        this.f7031a = categoryPath;
        Intrinsics.checkNotNullParameter(CategoryType.Path, "<set-?>");
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }
}
