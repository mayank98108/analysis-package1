package X1;

import L3.O1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.uxcam.internals.bt;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;
import t4.C1998a;

/* loaded from: classes3.dex */
public final class v implements com.google.android.play.core.splitinstall.internal.B {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7091a;

    public v(O1 o12) {
        this.f7091a = o12;
    }

    public void a(Canvas canvas, Bitmap bitmap) {
        Paint paint = (Paint) this.f7091a;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
        if (bitmap == null) {
            if (bt.f19122K == null) {
                if (C4.a.f222s == null) {
                    C4.a.f222s = new C4.a();
                }
                C4.a aVar = C4.a.f222s;
                Intrinsics.checkNotNull(aVar);
                if (C1998a.i == null) {
                    C1998a.i = new C1998a();
                }
                C1998a c1998a = C1998a.i;
                Intrinsics.checkNotNull(c1998a);
                bt.f19122K = new bt(aVar, c1998a);
            }
            bt btVar = bt.f19122K;
            Intrinsics.checkNotNull(btVar);
            bitmap = btVar.f19133a.a().f874b;
        }
        if (bitmap != null) {
            bitmap.getByteCount();
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Timer timer = com.uxcam.internals.v.f19292d;
    }

    @Override // com.google.android.play.core.splitinstall.internal.B
    public Object zza() {
        Context context = ((C0623i) ((O1) this.f7091a).f3521a).f7070a;
        return new u(context, context.getPackageName());
    }

    public v() {
        Paint paint = new Paint();
        this.f7091a = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setTextSize(22.0f);
    }
}
