package F3;

import K3.Y1;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.mobile.gro247.model.unbox.model.Products;
import com.mobile.gro247.utility.ExtensionUtilKt;
import com.mobile.gro247.view.basehomescreen.BaseHomeScreen;
import com.mobile.gro247.view.cart.BaseCartScreenFragment;
import com.mobile.gro247.view.cart.CouponBottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: F3.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0296u implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f722c;

    public /* synthetic */ ViewOnClickListenerC0296u(int i, Object obj, Object obj2) {
        this.f720a = i;
        this.f721b = obj;
        this.f722c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f720a;
        Object obj = this.f722c;
        Object obj2 = this.f721b;
        switch (i) {
            case 0:
                ((D) obj2).f519d.k((Products) obj);
                break;
            case 1:
                boolean z = BaseHomeScreen.f16358c0;
                String a6 = a3.b.a("https://api.whatsapp.com/send?phone=", ((TextView) obj2).getText().toString());
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(a6));
                ((BaseHomeScreen) obj).startActivity(intent);
                break;
            default:
                Y1 y12 = (Y1) obj2;
                CouponBottomSheet couponBottomSheet = (CouponBottomSheet) obj;
                Button applyBtn = y12.f1985b;
                Intrinsics.checkNotNullExpressionValue(applyBtn, "applyBtn");
                ExtensionUtilKt.hideView(applyBtn);
                ImageView loader = y12.f1988e;
                Intrinsics.checkNotNullExpressionValue(loader, "loader");
                ExtensionUtilKt.showView(loader);
                loader.startAnimation(AnimationUtils.loadAnimation(couponBottomSheet.getActivity(), com.mobile.gro247.d.rotate_clockwise));
                BaseCartScreenFragment.c cVar = couponBottomSheet.f16535b;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("listener");
                    cVar = null;
                }
                String couponCode = String.valueOf(y12.f1986c.getText());
                cVar.getClass();
                Intrinsics.checkNotNullParameter(couponCode, "couponCode");
                BaseCartScreenFragment baseCartScreenFragment = BaseCartScreenFragment.this;
                baseCartScreenFragment.getClass();
                Intrinsics.checkNotNullParameter(couponCode, "<set-?>");
                baseCartScreenFragment.f16502r = couponCode;
                Intrinsics.checkNotNullParameter(couponCode, "<set-?>");
                baseCartScreenFragment.f16503s = couponCode;
                baseCartScreenFragment.h0().S0(couponCode);
                baseCartScreenFragment.m0();
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0296u(D d6, Products products, int i) {
        this.f720a = 0;
        this.f721b = d6;
        this.f722c = products;
    }
}
