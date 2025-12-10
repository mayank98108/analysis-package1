package X1;

import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.measurement.internal.C1085s0;
import com.unbxd.sdk.internal.enums.ReferenceType;
import java.util.List;

/* loaded from: classes3.dex */
public class L implements com.google.android.gms.measurement.internal.L {

    /* renamed from: b, reason: collision with root package name */
    public static z f7032b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ L f7033c = new L(3);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ L f7034d = new L(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7035a;

    public /* synthetic */ L(int i) {
        this.f7035a = i;
    }

    @Override // com.google.android.gms.measurement.internal.L
    public /* synthetic */ Object zza() {
        switch (this.f7035a) {
            case 3:
                return new Boolean(zzpe.zza());
            default:
                List list = C1085s0.f12347a;
                return zzoy.zzk();
        }
    }

    public L() {
        this.f7035a = 5;
        ReferenceType referenceType = ReferenceType.None;
    }
}
