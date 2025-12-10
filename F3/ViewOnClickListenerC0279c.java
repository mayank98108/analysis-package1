package F3;

import F3.C0288l;
import android.app.AlertDialog;
import android.view.View;
import com.mobile.gro247.adapter.G0;
import com.mobile.gro247.model.cart.GiftItemInput;
import com.mobile.gro247.model.unbox.model.Products;
import com.mobile.gro247.view.home.HomeScreenActivity;

/* renamed from: F3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0279c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f633c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f634d;

    public /* synthetic */ ViewOnClickListenerC0279c(Object obj, int i, Object obj2, Object obj3) {
        this.f631a = i;
        this.f632b = obj;
        this.f633c = obj2;
        this.f634d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f631a) {
            case 0:
                C0288l.a aVar = (C0288l.a) this.f632b;
                C0288l c0288l = (C0288l) this.f633c;
                Products products = (Products) this.f634d;
                aVar.f676a.f1921o.setVisibility(0);
                aVar.f676a.n.setVisibility(8);
                G0 g02 = c0288l.f669d;
                String sku = products.getSku();
                if (sku == null) {
                    sku = "";
                }
                g02.a(products, sku);
                break;
            default:
                HomeScreenActivity homeScreenActivity = (HomeScreenActivity) this.f632b;
                AlertDialog alertDialog = (AlertDialog) this.f633c;
                GiftItemInput giftItemInput = (GiftItemInput) this.f634d;
                String cartId = homeScreenActivity.f16765z0.getCartId();
                if (cartId != null) {
                    homeScreenActivity.O0().J0(cartId, giftItemInput);
                }
                alertDialog.dismiss();
                break;
        }
    }
}
