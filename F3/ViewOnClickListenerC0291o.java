package F3;

import android.view.View;
import androidx.camera.video.AudioStats;
import com.mobile.gro247.model.cart.CartDetailsResponse;
import com.mobile.gro247.model.cart.CartDetailsResponseData;
import com.mobile.gro247.model.cart.CartGrandTotal;
import com.mobile.gro247.model.cart.CartPrices;
import com.mobile.gro247.model.cart.CartSellerPrice;
import com.mobile.gro247.model.cart.CustomerCartDetails;
import com.mobile.gro247.model.cart.SellerShippingMethodData;
import com.mobile.gro247.model.cart.UdropShippingDetails;
import com.mobile.gro247.model.unbox.model.Products;
import com.mobile.gro247.view.cart.CartSelectAddress;
import com.mobile.gro247.viewmodel.order.SelectAddressViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: F3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0291o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f683a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f685c;

    public /* synthetic */ ViewOnClickListenerC0291o(D d6, Products products, int i) {
        this.f684b = d6;
        this.f685c = products;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CustomerCartDetails customerCart;
        CartPrices prices;
        CartGrandTotal grand_total;
        CartDetailsResponseData data;
        CustomerCartDetails customerCart2;
        String id;
        String method_title;
        String carrier_title;
        String carrier_title2;
        CartDetailsResponseData data2;
        CustomerCartDetails customerCart3;
        CartPrices prices2;
        CartDetailsResponseData data3;
        CustomerCartDetails customerCart4;
        CartPrices prices3;
        switch (this.f683a) {
            case 0:
                ((D) this.f684b).f519d.k((Products) this.f685c);
                break;
            default:
                CartSelectAddress cartSelectAddress = (CartSelectAddress) this.f684b;
                CartDetailsResponse cartDetailsResponse = (CartDetailsResponse) this.f685c;
                cartSelectAddress.b0(true);
                ArrayList arrayList = new ArrayList();
                Double d6 = null;
                CartSellerPrice[] cart_seller_price = (cartDetailsResponse == null || (data3 = cartDetailsResponse.getData()) == null || (customerCart4 = data3.getCustomerCart()) == null || (prices3 = customerCart4.getPrices()) == null) ? null : prices3.getCart_seller_price();
                String str = "";
                if (cart_seller_price != null && cart_seller_price.length != 0) {
                    CartSellerPrice[] cart_seller_price2 = (cartDetailsResponse == null || (data2 = cartDetailsResponse.getData()) == null || (customerCart3 = data2.getCustomerCart()) == null || (prices2 = customerCart3.getPrices()) == null) ? null : prices2.getCart_seller_price();
                    Intrinsics.checkNotNull(cart_seller_price2);
                    for (CartSellerPrice cartSellerPrice : cart_seller_price2) {
                        ArrayList<SellerShippingMethodData> seller_shipping_methods = cartSellerPrice.getSeller_shipping_methods();
                        if (seller_shipping_methods != null && !seller_shipping_methods.isEmpty()) {
                            int seller_id = cartSellerPrice.getSeller_id();
                            SellerShippingMethodData sellerShippingMethodData = (SellerShippingMethodData) kotlin.collections.o.R(cartSellerPrice.getSeller_shipping_methods());
                            String str2 = (sellerShippingMethodData == null || (carrier_title2 = sellerShippingMethodData.getCarrier_title()) == null) ? "" : carrier_title2;
                            SellerShippingMethodData sellerShippingMethodData2 = (SellerShippingMethodData) kotlin.collections.o.R(cartSellerPrice.getSeller_shipping_methods());
                            String str3 = (sellerShippingMethodData2 == null || (carrier_title = sellerShippingMethodData2.getCarrier_title()) == null) ? "" : carrier_title;
                            SellerShippingMethodData sellerShippingMethodData3 = (SellerShippingMethodData) kotlin.collections.o.R(cartSellerPrice.getSeller_shipping_methods());
                            arrayList.add(new UdropShippingDetails(seller_id, str2, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, str3, (sellerShippingMethodData3 == null || (method_title = sellerShippingMethodData3.getMethod_title()) == null) ? "" : method_title, false, true));
                        }
                    }
                }
                SelectAddressViewModel a02 = cartSelectAddress.a0();
                if (cartDetailsResponse != null && (data = cartDetailsResponse.getData()) != null && (customerCart2 = data.getCustomerCart()) != null && (id = customerCart2.getId()) != null) {
                    str = id;
                }
                CartDetailsResponseData data4 = cartDetailsResponse.getData();
                if (data4 != null && (customerCart = data4.getCustomerCart()) != null && (prices = customerCart.getPrices()) != null && (grand_total = prices.getGrand_total()) != null) {
                    d6 = grand_total.getValue();
                }
                a02.F0(str, Intrinsics.areEqual(d6, AudioStats.AUDIO_AMPLITUDE_NONE) ? "free" : "cashondelivery", arrayList);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0291o(CartSelectAddress cartSelectAddress, CartDetailsResponse cartDetailsResponse) {
        this.f684b = cartSelectAddress;
        this.f685c = cartDetailsResponse;
    }
}
