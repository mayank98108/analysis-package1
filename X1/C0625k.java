package X1;

import L3.O1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.File;

/* renamed from: X1.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0625k implements com.google.android.play.core.splitinstall.internal.B {

    /* renamed from: a, reason: collision with root package name */
    public final O1 f7072a;

    public C0625k(O1 o12) {
        this.f7072a = o12;
    }

    @Override // com.google.android.play.core.splitinstall.internal.B
    @Nullable
    public final Object zza() {
        String string;
        Context context = ((C0623i) this.f7072a.f3521a).f7070a;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(context.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
