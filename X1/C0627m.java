package X1;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X1.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0627m implements com.google.android.play.core.splitinstall.internal.B {

    /* renamed from: a, reason: collision with root package name */
    public Object f7074a;

    public JSONObject a() {
        return new JSONObject((HashMap) this.f7074a);
    }

    @Override // com.google.android.play.core.splitinstall.internal.B
    public Object zza() {
        F f6 = (F) ((com.google.android.play.core.splitinstall.internal.B) this.f7074a).zza();
        if (f6 != null) {
            return f6;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
