package F3;

import F3.C0288l;
import K3.Z2;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.camera2.internal.K0;
import androidx.camera.camera2.internal.N0;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import coil.request.f;
import coil.size.Scale;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.mobile.gro247.MarketConstants;
import com.mobile.gro247.adapter.G0;
import com.mobile.gro247.adapter.H0;
import com.mobile.gro247.model.cart.CartDetailsResponse;
import com.mobile.gro247.model.products.product.Items;
import com.mobile.gro247.model.smartlist.ShoppingData;
import com.mobile.gro247.model.smartlist.ShoppingListData;
import com.mobile.gro247.model.unbox.UnboxKeys;
import com.mobile.gro247.model.unbox.model.Products;
import com.mobile.gro247.utility.AppUtil;
import com.mobile.gro247.utility.AutoScrollUtil;
import com.mobile.gro247.utility.DecimalUtils;
import com.mobile.gro247.utility.ExtensionUtilKt;
import com.mobile.gro247.utility.PLPUtility;
import com.mobile.gro247.utility.TextWatcherKt;
import com.mobile.gro247.utility.UnboxPLPUtility;
import com.mobile.gro247.utility.preferences.Preferences;
import com.mobile.gro247.utility.unbox.UnBoxPLPUtility;
import com.mobile.gro247.utility.unbox.UnBoxUtils;
import com.mobile.gro247.view.home.UserColdState;
import com.mobile.gro247.view.home.adapter.callback.HomeScreenEvent;
import com.mobile.gro247.view.unboxProductList.UnboxMyShoppingListActivity;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nUnBoxShoppingListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnBoxShoppingListAdapter.kt\ncom/mobile/gro247/adapter/unbox/UnBoxShoppingListAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ImageViews.kt\ncoil/ImageViews\n+ 4 Contexts.kt\ncoil/Contexts\n+ 5 ImageViews.kt\ncoil/ImageViews$load$5\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1050:1\n216#2,2:1051\n216#2,2:1053\n54#3:1055\n55#3,2:1057\n97#3,5:1059\n102#3:1065\n22#3:1066\n24#3:1068\n97#3,6:1069\n12#4:1056\n12#4:1067\n55#5:1064\n1#6:1075\n*S KotlinDebug\n*F\n+ 1 UnBoxShoppingListAdapter.kt\ncom/mobile/gro247/adapter/unbox/UnBoxShoppingListAdapter\n*L\n654#1:1051,2\n678#1:1053,2\n778#1:1055\n778#1:1057,2\n778#1:1059,5\n778#1:1065\n780#1:1066\n780#1:1068\n780#1:1069,6\n778#1:1056\n780#1:1067\n778#1:1064\n*E\n"})
/* renamed from: F3.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0288l extends RecyclerView.Adapter<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f666a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Products> f667b;

    /* renamed from: c, reason: collision with root package name */
    public CartDetailsResponse f668c;

    /* renamed from: d, reason: collision with root package name */
    public final G0 f669d;

    /* renamed from: e, reason: collision with root package name */
    public final String f670e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0290n f671f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<Items> f672h;
    public final Preferences i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f673j;

    /* renamed from: k, reason: collision with root package name */
    public int f674k;
    public ArrayList<String> l;

    /* renamed from: m, reason: collision with root package name */
    public String f675m;

    /* renamed from: F3.l$a */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public K3.X f676a;

        public a() {
            throw null;
        }
    }

    public C0288l(Context context, List itemsList, CartDetailsResponse cartDetailsResponse, G0 listener, UserColdState userColdState, String category, InterfaceC0290n idListener, String sellerID, ArrayList shoppingListData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemsList, "itemsList");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(userColdState, "userColdState");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(idListener, "idListener");
        Intrinsics.checkNotNullParameter(sellerID, "sellerID");
        Intrinsics.checkNotNullParameter(shoppingListData, "shoppingListData");
        this.f666a = context;
        this.f667b = itemsList;
        this.f668c = cartDetailsResponse;
        this.f669d = listener;
        this.f670e = category;
        this.f671f = idListener;
        this.g = sellerID;
        this.f672h = shoppingListData;
        this.i = new Preferences(context);
        new DecimalFormat("0.00");
        new ArrayList();
        this.l = new ArrayList<>();
        this.f675m = "";
    }

    public final String b(int i, Products products, String str, String str2) {
        int i3 = com.mobile.gro247.l.ar_unit;
        Context context = this.f666a;
        String string = context.getString(i3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (kotlin.text.p.t(str, string, true)) {
            return str2;
        }
        String string2 = context.getString(com.mobile.gro247.l.ar_cases);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (!kotlin.text.p.t(str, string2, true)) {
            return String.valueOf(Integer.parseInt(str2) * i);
        }
        int parseInt = Integer.parseInt(str2);
        String nbItemsCase = products.getNbItemsCase();
        return String.valueOf(parseInt * (nbItemsCase != null ? Integer.parseInt(nbItemsCase) : 1));
    }

    public final String c(int i, Products products, String str, String str2) {
        int i3 = com.mobile.gro247.l.ar_unit;
        Context context = this.f666a;
        String string = context.getString(i3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (kotlin.text.p.t(str, string, true)) {
            return String.valueOf((int) Double.parseDouble(str2));
        }
        String string2 = context.getString(com.mobile.gro247.l.ar_cases);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (!kotlin.text.p.t(str, string2, true)) {
            return String.valueOf(((int) Double.parseDouble(str2)) / i);
        }
        int parseDouble = (int) Double.parseDouble(str2);
        String nbItemsCase = products.getNbItemsCase();
        return String.valueOf(parseDouble / (nbItemsCase != null ? Integer.parseInt(nbItemsCase) : 1));
    }

    public final void d(String str, a aVar, Products products, String str2, int i, int i3) {
        try {
            K3.X x6 = aVar.f676a;
            EditText editText = x6.f1928v;
            TextView textView = x6.f1912b;
            TextView textView2 = x6.f1927u;
            ImageView imageView = x6.g;
            ImageView imageView2 = x6.f1916f;
            int parseInt = Integer.parseInt(b(i3, products, str2, editText.getText().toString()));
            int parseDouble = (int) Double.parseDouble(str);
            Context context = this.f666a;
            if (parseInt <= parseDouble || Integer.parseInt(editText.getText().toString()) == 1) {
                if (Integer.parseInt(b(i3, products, str2, editText.getText().toString())) < ((int) Double.parseDouble(str))) {
                    editText.setText(Integer.parseInt(c(i3, products, str2, str)) > 0 ? c(i3, products, str2, str.toString()) : "1");
                    imageView2.setImageResource(com.mobile.gro247.g.ic_minus);
                    imageView2.setColorFilter(context.getColor(com.mobile.gro247.e.latam_blue_filter_dark));
                    imageView2.setEnabled(false);
                }
                if (Integer.parseInt(c(i3, products, str2, str)) > 1) {
                    textView2.setText(context.getString(com.mobile.gro247.l.ar_pdp_minimum_qty_text) + ' ' + c(i3, products, str2, str) + ' ' + AppUtil.INSTANCE.getCalculatedUOM(str2, (int) Double.parseDouble(str), context));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
            } else {
                imageView2.setImageResource(com.mobile.gro247.g.ic_minus);
                imageView2.setColorFilter(context.getColor(com.mobile.gro247.e.colorPrimary));
                imageView2.setEnabled(true);
                textView2.setVisibility(8);
            }
            if (Integer.parseInt(b(i3, products, str2, editText.getText().toString())) < i) {
                imageView.setColorFilter(context.getColor(com.mobile.gro247.e.colorPrimary));
                imageView.setImageResource(com.mobile.gro247.g.ic_baseline_add_24);
                imageView.setEnabled(true);
                textView.setVisibility(8);
                return;
            }
            if (Integer.parseInt(b(i3, products, str2, editText.getText().toString())) > i) {
                editText.setText(c(i3, products, str2, String.valueOf(i)));
                imageView.setColorFilter(context.getColor(com.mobile.gro247.e.latam_blue_filter_dark));
                imageView.setImageResource(com.mobile.gro247.g.ic_baseline_add_24);
                imageView.setEnabled(false);
                textView.setText(context.getString(com.mobile.gro247.l.ar_pdp_available_qty_text) + ' ' + c(i3, products, str2, String.valueOf(i)) + ' ' + AppUtil.INSTANCE.getCalculatedUOM(str2, i, context));
                textView.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f667b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.String] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, final int i) {
        a aVar2;
        final C0288l c0288l;
        Preferences preferences;
        List<Products> list;
        Ref.ObjectRef objectRef;
        K3.X x6;
        Button button;
        String str;
        String str2;
        ImageView imageView;
        EditText editText;
        HashMap<Integer, String> hashMap;
        HashMap<Integer, String> sellerStatus;
        String str3;
        HashMap<Integer, String> sellerStatus2;
        a holder = aVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<Products> list2 = this.f667b;
        final Products products = list2.get(i);
        if (products == null) {
            return;
        }
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new HashMap();
        final K3.X x7 = holder.f676a;
        AppUtil.Companion companion = AppUtil.INSTANCE;
        Preferences preferences2 = this.i;
        String sellerFilter = companion.getSellerFilter(preferences2 != null ? preferences2.getSellerStatus() : null);
        Context context = this.f666a;
        if (sellerFilter == null || sellerFilter.length() == 0) {
            aVar2 = holder;
            c0288l = this;
            preferences = preferences2;
            TextView mrpPrice = x7.f1919k;
            Intrinsics.checkNotNullExpressionValue(mrpPrice, "mrpPrice");
            ExtensionUtilKt.invisibleView(mrpPrice);
            x7.f1922p.setVisibility(8);
            TextView discount = x7.f1914d;
            Intrinsics.checkNotNullExpressionValue(discount, "discount");
            ExtensionUtilKt.invisibleView(discount);
        } else {
            ArrayList<UnboxKeys> unboxKeys = products.getUnboxKeys();
            preferences = preferences2;
            String parsedSellerValue = unboxKeys != null ? companion.getParsedSellerValue("sellerRegularPrice", products, unboxKeys, "_unx_d") : null;
            ArrayList<UnboxKeys> unboxKeys2 = products.getUnboxKeys();
            aVar2 = holder;
            String parsedSellerValue2 = unboxKeys2 != null ? companion.getParsedSellerValue("sellerFinalPrice", products, unboxKeys2, "_unx_d") : null;
            ArrayList<UnboxKeys> unboxKeys3 = products.getUnboxKeys();
            String parsedSellerValue3 = unboxKeys3 != null ? companion.getParsedSellerValue("sellerPriceIsOffer", products, unboxKeys3, "_unx_ts") : null;
            ArrayList<UnboxKeys> unboxKeys4 = products.getUnboxKeys();
            String parsedSellerValue4 = unboxKeys4 != null ? companion.getParsedSellerValue("sellerDiscountPrdPerct", products, unboxKeys4, "_unx_d") : null;
            ArrayList<UnboxKeys> unboxKeys5 = products.getUnboxKeys();
            String str4 = parsedSellerValue4;
            if (unboxKeys5 != null) {
                companion.getParsedSellerValue("sellerTierPrice", products, unboxKeys5, "_unx_ts");
            }
            ArrayList<UnboxKeys> unboxKeys6 = products.getUnboxKeys();
            if (unboxKeys6 != null) {
                companion.getParsedSellerValue("sellerQtyEanUnit", products, unboxKeys6, "_unx_d");
            }
            ArrayList<UnboxKeys> unboxKeys7 = products.getUnboxKeys();
            if (unboxKeys7 != null) {
                companion.getParsedSellerValue("sellerQtyEanKg", products, unboxKeys7, "_unx_d");
            }
            ArrayList<UnboxKeys> unboxKeys8 = products.getUnboxKeys();
            if (unboxKeys8 != null) {
                companion.getParsedSellerValue("sellerMinSellQty", products, unboxKeys8, "_unx_d");
            }
            if (!Intrinsics.areEqual(parsedSellerValue3, "true") || parsedSellerValue2 == null || parsedSellerValue2.length() == 0) {
                TextView textView = x7.f1922p;
                TextView textView2 = x7.f1919k;
                textView.setVisibility(8);
                if (preferences != null && (sellerStatus = preferences.getSellerStatus()) != null) {
                    for (Map.Entry<Integer, String> entry : sellerStatus.entrySet()) {
                        if ((Intrinsics.areEqual(entry.getValue(), "0") || Intrinsics.areEqual(entry.getValue(), "1")) && !Intrinsics.areEqual(parsedSellerValue, parsedSellerValue2)) {
                            MarketConstants.Companion companion2 = MarketConstants.f15574a;
                            androidx.compose.foundation.layout.b.b(AppUtil.INSTANCE, parsedSellerValue2, parsedSellerValue, textView2);
                        } else {
                            MarketConstants.Companion companion3 = MarketConstants.f15574a;
                            androidx.compose.foundation.layout.b.b(AppUtil.INSTANCE, parsedSellerValue2, parsedSellerValue, textView2);
                        }
                    }
                }
            } else if (preferences != null && (sellerStatus2 = preferences.getSellerStatus()) != null) {
                for (Map.Entry<Integer, String> entry2 : sellerStatus2.entrySet()) {
                    if ((Intrinsics.areEqual(entry2.getValue(), "0") || Intrinsics.areEqual(entry2.getValue(), "1")) && !Intrinsics.areEqual(parsedSellerValue, parsedSellerValue2)) {
                        TextView strikedMrpPrice = x7.f1922p;
                        Intrinsics.checkNotNullExpressionValue(strikedMrpPrice, "strikedMrpPrice");
                        ExtensionUtilKt.showView(strikedMrpPrice);
                        TextView textView3 = x7.f1922p;
                        textView3.setPaintFlags(textView3.getPaintFlags() | 16);
                        MarketConstants.Companion companion4 = MarketConstants.f15574a;
                        textView3.setText(MarketConstants.Companion.f((parsedSellerValue == null || parsedSellerValue.length() == 0) ? AudioStats.AUDIO_AMPLITUDE_NONE : Double.parseDouble(parsedSellerValue)));
                    }
                    TextView textView4 = x7.f1919k;
                    MarketConstants.Companion companion5 = MarketConstants.f15574a;
                    androidx.compose.foundation.layout.b.b(AppUtil.INSTANCE, parsedSellerValue2, parsedSellerValue, textView4);
                }
            }
            if (str4 == null || str4.length() == 0) {
                context = context;
                TextView discount2 = x7.f1914d;
                Intrinsics.checkNotNullExpressionValue(discount2, "discount");
                ExtensionUtilKt.hideView(discount2);
            } else {
                TextView discount3 = x7.f1914d;
                Intrinsics.checkNotNullExpressionValue(discount3, "discount");
                ExtensionUtilKt.showView(discount3);
                TextView textView5 = x7.f1914d;
                StringBuilder sb = new StringBuilder("-");
                double parseDouble = Double.parseDouble(str4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(DecimalUtils.INSTANCE.roundOfDiscountValue(parseDouble));
                if (context != null) {
                    context = context;
                    str3 = context.getString(com.mobile.gro247.l.percent_sign);
                } else {
                    context = context;
                    str3 = null;
                }
                sb2.append(str3);
                sb2.append(' ');
                sb2.append(context != null ? context.getString(com.mobile.gro247.l.discount_off) : null);
                sb.append(sb2.toString());
                textView5.setText(sb.toString());
            }
            c0288l = this;
            x7.n.setOnClickListener(new View.OnClickListener() { // from class: F3.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    G0 g02 = C0288l.this.f669d;
                    Products products2 = products;
                    String sku = products2.getSku();
                    if (sku == null) {
                        sku = "";
                    }
                    g02.a(products2, sku);
                    K3.X x8 = x7;
                    ImageView selectWishlistImage = x8.n;
                    Intrinsics.checkNotNullExpressionValue(selectWishlistImage, "selectWishlistImage");
                    ExtensionUtilKt.hideView(selectWishlistImage);
                    ImageView selectedWishlistImage = x8.f1921o;
                    Intrinsics.checkNotNullExpressionValue(selectedWishlistImage, "selectedWishlistImage");
                    ExtensionUtilKt.showView(selectedWishlistImage);
                }
            });
        }
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        AppUtil.Companion companion6 = AppUtil.INSTANCE;
        objectRef3.element = companion6.getParsedSellerValue("sellerStockQty", products, products.getUnboxKeys(), "_unx_d");
        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = companion6.getParsedSellerValue("sellerQtyEanUnit", products, products.getUnboxKeys(), "_unx_d");
        String parsedSellerValue5 = companion6.getParsedSellerValue("sellerQtyEanKg", products, products.getUnboxKeys(), "_unx_d");
        final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        objectRef5.element = companion6.getParsedSellerValue("sellerMinSellQty", products, products.getUnboxKeys(), "_unx_d");
        CharSequence charSequence = (CharSequence) objectRef3.element;
        if (charSequence == null || charSequence.length() == 0) {
            objectRef3.element = "0";
        }
        CharSequence charSequence2 = (CharSequence) objectRef4.element;
        if (charSequence2 == null || charSequence2.length() == 0) {
            objectRef4.element = "1";
        }
        if (parsedSellerValue5 == null || parsedSellerValue5.length() == 0) {
            parsedSellerValue5 = "0";
        }
        CharSequence charSequence3 = (CharSequence) objectRef5.element;
        if (charSequence3 == null || charSequence3.length() == 0 || ((String) objectRef5.element).equals("0") || ((String) objectRef5.element).equals(GLUtils.VERSION_UNKNOWN)) {
            objectRef5.element = "1";
        }
        String str5 = (String) objectRef4.element;
        String str6 = (String) objectRef5.element;
        final a aVar3 = aVar2;
        K3.X x8 = aVar3.f676a;
        UnBoxPLPUtility.Companion companion7 = UnBoxPLPUtility.INSTANCE;
        Context context2 = c0288l.f666a;
        Intrinsics.checkNotNull(context2);
        c0288l.l = companion7.readShoppingListQuantity(products, context2, str5, parsedSellerValue5, str6);
        AppCompatSpinner appCompatSpinner = x7.f1929w;
        ConstraintLayout constraintLayout = x7.f1923q;
        ConstraintLayout productTop = x7.f1920m;
        TabLayout tabLayout = x7.f1925s;
        ViewPager2 vpImageSlider = x7.f1930x;
        TextView textView6 = x7.f1924r;
        ImageView imageView2 = x7.f1916f;
        CheckBox checkBox = x7.f1913c;
        ImageView imageView3 = x7.f1921o;
        ImageView imageView4 = x7.n;
        EditText editText2 = x7.f1928v;
        AppCompatImageView imageViewProduct = x7.f1915e;
        Z2 z22 = x7.f1917h;
        TextView outOfStockLabel = z22.f2007b;
        ConstraintLayout constraintLayout2 = z22.f2006a;
        Button button2 = z22.f2008c;
        appCompatSpinner.setAdapter((SpinnerAdapter) new H0(context, c0288l.l));
        Preferences preferences3 = preferences;
        final C0288l c0288l2 = c0288l;
        appCompatSpinner.setOnItemSelectedListener(new C0289m(c0288l2, aVar3, x8, products, str5, str6));
        CartDetailsResponse cartDetailsResponse = c0288l2.f668c;
        if (cartDetailsResponse != null) {
            UnboxPLPUtility.Companion companion8 = UnboxPLPUtility.INSTANCE;
            companion8.readQuantityFromProductDetails(cartDetailsResponse, companion8.readCartProductSku(products));
        }
        imageView4.setVisibility(0);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: F3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0288l.a aVar4 = C0288l.a.this;
                aVar4.f676a.f1921o.setVisibility(8);
                aVar4.f676a.n.setVisibility(0);
                G0 g02 = c0288l2.f669d;
                UnBoxUtils.Companion companion9 = UnBoxUtils.INSTANCE;
                Products products2 = products;
                g02.u(companion9.getProductId(products2.getUniqueId(), products2.getEntityId()), products2);
            }
        });
        imageView4.setOnClickListener(new ViewOnClickListenerC0279c(aVar3, 0, c0288l2, products));
        String sku = list2.get(i).getSku();
        ArrayList<Items> shoppingListData = c0288l2.f672h;
        Intrinsics.checkNotNullParameter(shoppingListData, "shoppingListData");
        Iterator it = shoppingListData.iterator();
        boolean z = false;
        while (true) {
            Iterator it2 = it;
            if (!it.hasNext()) {
                break;
            }
            if (Intrinsics.areEqual(((Items) it2.next()).getSku(), sku)) {
                z = true;
            }
            it = it2;
        }
        if (z) {
            imageView3.setVisibility(0);
            imageView4.setVisibility(8);
            imageView3.setEnabled(true);
        }
        UnboxPLPUtility.Companion companion9 = UnboxPLPUtility.INSTANCE;
        textView6.setText(companion9.readCartProductName(products));
        List<String> mediaImages = products.getMediaImages();
        if (mediaImages == null || mediaImages.isEmpty()) {
            imageViewProduct.setVisibility(0);
            vpImageSlider.setVisibility(4);
            tabLayout.setVisibility(8);
            String str7 = products.getImageUrl().get(0);
            if (str7 == null || str7.length() != 0) {
                Intrinsics.checkNotNullExpressionValue(imageViewProduct, "imageViewProduct");
                Context context3 = imageViewProduct.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "context");
                coil.f a6 = coil.a.a(context3);
                Context context4 = imageViewProduct.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "context");
                f.a aVar4 = new f.a(context4);
                aVar4.f9069c = str7;
                aVar4.f(imageViewProduct);
                aVar4.d(com.mobile.gro247.g.ic_image_placeholder);
                aVar4.c(com.mobile.gro247.g.ic_image_placeholder);
                aVar4.e(Scale.FILL);
                f5.b bVar = kotlinx.coroutines.W.f21304a;
                N0.d(aVar4, f5.a.f20594a, a6);
            } else {
                Intrinsics.checkNotNullExpressionValue(imageViewProduct, "imageViewProduct");
                int i3 = com.mobile.gro247.g.ic_image_placeholder;
                coil.f c6 = K4.f.c(imageViewProduct, "context");
                Integer valueOf = Integer.valueOf(i3);
                Context context5 = imageViewProduct.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "context");
                f.a aVar5 = new f.a(context5);
                aVar5.f9069c = valueOf;
                aVar5.f(imageViewProduct);
                c6.a(aVar5.a());
            }
        } else {
            imageViewProduct.setVisibility(4);
            vpImageSlider.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            arrayList.addAll(products.getImageUrl());
            arrayList.addAll(products.getMediaImages());
            vpImageSlider.setOrientation(0);
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            d4.d dVar = new d4.d((FragmentActivity) context, arrayList, products.getSku());
            vpImageSlider.setAdapter(dVar);
            AutoScrollUtil.Companion companion10 = AutoScrollUtil.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(vpImageSlider, "vpImageSlider");
            companion10.infiniteImageSwipeViewPager(vpImageSlider, dVar);
            new TabLayoutMediator(tabLayout, vpImageSlider, new C0287k()).attach();
            if (arrayList.size() == 1) {
                tabLayout.setVisibility(8);
            } else {
                tabLayout.setVisibility(0);
            }
            Unit unit = Unit.f20987a;
        }
        if (companion7.readProductStockStatusRecommendations(companion6.getParsedSellerValue("sellerStockStatus", products, products.getUnboxKeys(), "_unx_d"), (String) objectRef3.element, companion6.getParsedSellerValue("sellerMinSellQty", products, products.getUnboxKeys(), "_unx_d"), products.getSellerZoneId())) {
            checkBox.setVisibility(8);
            x6 = x7;
            x6.l.setVisibility(8);
            appCompatSpinner.setVisibility(8);
            x6.f1919k.setVisibility(8);
            x6.f1922p.setVisibility(8);
            x6.f1914d.setVisibility(8);
            if (((HashMap) objectRef2.element).containsKey(Integer.valueOf(UnBoxUtils.INSTANCE.getProductId(products.getUniqueId(), products.getEntityId())))) {
                Intrinsics.checkNotNullExpressionValue(productTop, "productTop");
                ExtensionUtilKt.showView(productTop);
                TextView textView7 = x6.f1926t;
                String string = x6.f1911a.getContext().getString(com.mobile.gro247.l.ar_notify_message);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                list = list2;
                objectRef = objectRef3;
                K0.e(new Object[]{preferences3.getUserEmail()}, 1, string, "format(...)", textView7);
                constraintLayout2.setVisibility(0);
                Intrinsics.checkNotNullExpressionValue(outOfStockLabel, "outOfStockLabel");
                ExtensionUtilKt.showView(outOfStockLabel);
                button = button2;
                button.setEnabled(false);
                button.setText(context.getString(com.mobile.gro247.l.ar_requested_notification));
                checkBox = checkBox;
            } else {
                list = list2;
                objectRef = objectRef3;
                button = button2;
                if (preferences3 != null) {
                    checkBox = checkBox;
                    hashMap = preferences3.getSellerStatus();
                } else {
                    checkBox = checkBox;
                    hashMap = null;
                }
                String sellerFilter2 = companion6.getSellerFilter(hashMap);
                if (sellerFilter2 == null || sellerFilter2.length() == 0) {
                    constraintLayout2.setVisibility(8);
                } else {
                    Intrinsics.checkNotNullExpressionValue(productTop, "productTop");
                    ExtensionUtilKt.hideView(productTop);
                    constraintLayout2.setVisibility(0);
                    Intrinsics.checkNotNullExpressionValue(outOfStockLabel, "outOfStockLabel");
                    ExtensionUtilKt.showView(outOfStockLabel);
                    button.setEnabled(true);
                    button.setText(context.getString(com.mobile.gro247.l.ar_notification));
                }
            }
        } else {
            list = list2;
            objectRef = objectRef3;
            x6 = x7;
            button = button2;
        }
        ArrayList<UnboxKeys> unboxKeys9 = products.getUnboxKeys();
        if (unboxKeys9 != null) {
            str = "_unx_ts";
            str2 = companion6.getParsedSellerValue("sellerProductlabelPositionFirst", products, unboxKeys9, str);
        } else {
            str = "_unx_ts";
            str2 = null;
        }
        ArrayList<UnboxKeys> unboxKeys10 = products.getUnboxKeys();
        String parsedSellerValue6 = unboxKeys10 != null ? companion6.getParsedSellerValue("sellerProductlabelPositionSecond", products, unboxKeys10, str) : null;
        if ((str2 == null || str2.length() == 0) && (parsedSellerValue6 == null || parsedSellerValue6.length() == 0)) {
            constraintLayout.setVisibility(8);
        } else {
            AppCompatTextView appCompatTextView = x6.f1918j;
            AppCompatTextView appCompatTextView2 = x6.i;
            constraintLayout.setVisibility(0);
            if (str2 == null || str2.length() == 0 || parsedSellerValue6 == null || parsedSellerValue6.length() == 0) {
                String str8 = "";
                appCompatTextView2.setText((str2 == null || str2.length() <= 0) ? "" : Intrinsics.areEqual(str2, "Discount Price") ? context.getString(com.mobile.gro247.l.ar_discount_price) : str2);
                if (parsedSellerValue6 != null && parsedSellerValue6.length() > 0) {
                    str8 = Intrinsics.areEqual(parsedSellerValue6, "Discount Price") ? context.getString(com.mobile.gro247.l.ar_discount_price) : parsedSellerValue6;
                }
                appCompatTextView.setText(str8);
                appCompatTextView2.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
                appCompatTextView.setVisibility((parsedSellerValue6 == null || parsedSellerValue6.length() == 0) ? 8 : 0);
            } else if (Intrinsics.areEqual(str2, parsedSellerValue6)) {
                appCompatTextView2.setVisibility(0);
                appCompatTextView.setVisibility(8);
                if (Intrinsics.areEqual(str2, "Discount Price")) {
                    str2 = context.getString(com.mobile.gro247.l.ar_discount_price);
                }
                appCompatTextView2.setText(str2);
            }
        }
        textView6.setOnClickListener(new View.OnClickListener(c0288l2, i) { // from class: F3.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0288l f636b;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f636b.f669d.k(Products.this);
            }
        });
        imageViewProduct.setOnClickListener(new View.OnClickListener(c0288l2, i) { // from class: F3.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0288l f638b;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f638b.f669d.k(Products.this);
            }
        });
        List<Products> list3 = list;
        final Ref.ObjectRef objectRef6 = objectRef;
        button.setOnClickListener(new View.OnClickListener() { // from class: F3.f
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0288l c0288l3 = C0288l.this;
                G0 g02 = c0288l3.f669d;
                UnBoxUtils.Companion companion11 = UnBoxUtils.INSTANCE;
                Products products2 = products;
                int productId = companion11.getProductId(products2.getUniqueId(), products2.getEntityId());
                HomeScreenEvent homeScreenEvent = HomeScreenEvent.NO_EVENT_DEFAULT;
                AppUtil.Companion companion12 = AppUtil.INSTANCE;
                g02.f(productId, homeScreenEvent, Integer.parseInt(companion12.getParsedSellerIdNotify("sellerStockQty", products2.getUnboxKeys())));
                C0288l.a aVar6 = aVar3;
                ConstraintLayout productTop2 = aVar6.f676a.f1920m;
                Intrinsics.checkNotNullExpressionValue(productTop2, "productTop");
                ExtensionUtilKt.showView(productTop2);
                K3.X x9 = aVar6.f676a;
                TextView textView8 = x9.f1926t;
                Button button3 = x9.f1917h.f2008c;
                String string2 = x9.f1911a.getContext().getString(com.mobile.gro247.l.ar_notify_message);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                K0.e(new Object[]{c0288l3.i.getUserEmail()}, 1, string2, "format(...)", textView8);
                c0288l3.f669d.r(products2, c0288l3.f670e);
                if (UnBoxPLPUtility.INSTANCE.readProductStockStatusRecommendations(companion12.getParsedSellerValue("sellerStockStatus", products2, products2.getUnboxKeys(), "_unx_d"), (String) objectRef6.element, companion12.getParsedSellerValue("sellerMinSellQty", products2, products2.getUnboxKeys(), "_unx_d"), products2.getSellerZoneId())) {
                    button3.setEnabled(false);
                    Context context6 = c0288l3.f666a;
                    button3.setText(context6 != null ? context6.getString(com.mobile.gro247.l.ar_requested_notification) : null);
                }
                Ref.ObjectRef objectRef7 = objectRef2;
                ((Map) objectRef7.element).put(Integer.valueOf(companion11.getProductId(products2.getUniqueId(), products2.getEntityId())), Boolean.TRUE);
            }
        });
        CartDetailsResponse cartDetailsResponse2 = c0288l2.f668c;
        if (cartDetailsResponse2 != null) {
            PLPUtility.INSTANCE.isItemAddedInCart(cartDetailsResponse2, companion9.readCartProductName(list3.get(i)));
        }
        CharSequence charSequence4 = (CharSequence) objectRef5.element;
        if (charSequence4 == null || charSequence4.length() == 0) {
            imageView = imageView2;
            editText = editText2;
        } else {
            editText = editText2;
            editText.setText(String.valueOf((int) Double.parseDouble((String) objectRef5.element)));
            if (Intrinsics.areEqual(editText.getText().toString(), String.valueOf((int) Double.parseDouble((String) objectRef5.element)))) {
                editText.setText(String.valueOf((int) Double.parseDouble((String) objectRef5.element)));
                imageView = imageView2;
                imageView.setImageResource(com.mobile.gro247.g.ic_minus);
                imageView.setColorFilter(context.getColor(com.mobile.gro247.e.latam_blue_filter_dark));
            } else {
                imageView = imageView2;
            }
        }
        CheckBox checkBox2 = checkBox;
        checkBox2.setChecked(c0288l2.f673j);
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F3.g
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton p02, boolean z6) {
                C0288l c0288l3 = C0288l.this;
                Context context6 = c0288l3.f666a;
                Intrinsics.checkNotNullParameter(p02, "p0");
                if (!z6) {
                    c0288l3.f673j = false;
                    int i6 = c0288l3.f674k;
                    if (i6 > 0) {
                        c0288l3.f674k = i6 - 1;
                    }
                    if (context6 instanceof UnboxMyShoppingListActivity) {
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type com.mobile.gro247.view.unboxProductList.UnboxMyShoppingListActivity");
                        UnboxMyShoppingListActivity unboxMyShoppingListActivity = (UnboxMyShoppingListActivity) context6;
                        unboxMyShoppingListActivity.getClass();
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type com.mobile.gro247.view.unboxProductList.UnboxMyShoppingListActivity");
                        unboxMyShoppingListActivity.s1(false);
                    } else {
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type com.mobile.gro247.view.unboxProductList.UnboxMyShoppingListActivity");
                        ((UnboxMyShoppingListActivity) context6).s1(false);
                    }
                } else if (c0288l3.f674k < c0288l3.f667b.size()) {
                    c0288l3.f674k++;
                }
                int i7 = c0288l3.f674k;
                String str9 = c0288l3.g;
                G0 g02 = c0288l3.f669d;
                if (i7 == c0288l3.f667b.size()) {
                    if (context6 instanceof UnboxMyShoppingListActivity) {
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type com.mobile.gro247.view.unboxProductList.UnboxMyShoppingListActivity");
                        UnboxMyShoppingListActivity unboxMyShoppingListActivity2 = (UnboxMyShoppingListActivity) context6;
                        unboxMyShoppingListActivity2.getClass();
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type com.mobile.gro247.view.unboxProductList.UnboxMyShoppingListActivity");
                        unboxMyShoppingListActivity2.s1(false);
                    } else {
                        c0288l3.f673j = true;
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type com.mobile.gro247.view.unboxProductList.UnboxMyShoppingListActivity");
                        ((UnboxMyShoppingListActivity) context6).s1(true);
                    }
                }
                C0288l.a aVar6 = aVar3;
                String obj = aVar6.f676a.f1928v.getText().toString();
                if (obj == null || obj.length() == 0) {
                    obj = "1";
                }
                boolean isChecked = aVar6.f676a.f1913c.isChecked();
                Products products2 = products;
                if (isChecked) {
                    g02.S(new ShoppingListData(new ShoppingData(Integer.parseInt(obj), c0288l3.f675m, products2.getSku(), Integer.parseInt(str9))), true, products2);
                    c0288l3.f673j = true;
                } else {
                    c0288l3.f673j = false;
                    g02.S(new ShoppingListData(new ShoppingData(Integer.parseInt(obj), c0288l3.f675m, products2.getSku(), Integer.parseInt(str9))), false, products2);
                    c0288l3.f673j = false;
                    if (context6 instanceof UnboxMyShoppingListActivity) {
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type com.mobile.gro247.view.unboxProductList.UnboxMyShoppingListActivity");
                        ((UnboxMyShoppingListActivity) context6).s1(true);
                    } else {
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type com.mobile.gro247.view.unboxProductList.UnboxMyShoppingListActivity");
                        ((UnboxMyShoppingListActivity) context6).s1(false);
                    }
                }
                g02.C(products2, i);
            }
        });
        editText.addTextChangedListener(TextWatcherKt.afterTextChanged(new Function2() { // from class: F3.h
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                TextWatcher afterTextChanged = (TextWatcher) obj;
                Editable it3 = (Editable) obj2;
                Intrinsics.checkNotNullParameter(afterTextChanged, "$this$afterTextChanged");
                Intrinsics.checkNotNullParameter(it3, "it");
                C0288l.a aVar6 = C0288l.a.this;
                K3.X x9 = aVar6.f676a;
                EditText editText3 = x9.f1928v;
                AppCompatSpinner appCompatSpinner2 = x9.f1929w;
                String obj3 = editText3.getText().toString();
                C0288l c0288l3 = c0288l2;
                Products products2 = products;
                Ref.ObjectRef objectRef7 = objectRef4;
                Ref.ObjectRef objectRef8 = objectRef5;
                if (obj3 == null || obj3.length() == 0) {
                    editText3.setText(c0288l3.c((int) Double.parseDouble((String) objectRef7.element), products2, appCompatSpinner2.getSelectedItem().toString(), (String) objectRef8.element));
                } else {
                    c0288l3.d((String) objectRef8.element, aVar6, products2, appCompatSpinner2.getSelectedItem().toString(), (int) Double.parseDouble((String) objectRef6.element), (int) Double.parseDouble((String) objectRef7.element));
                }
                c0288l3.f669d.S(new ShoppingListData(new ShoppingData(Integer.parseInt(editText3.getText().toString()), c0288l3.f675m, products2.getSku(), Integer.parseInt(c0288l3.g))), x9.f1913c.isChecked(), products2);
                return Unit.f20987a;
            }
        }));
        x6.g.setOnClickListener(new View.OnClickListener() { // from class: F3.i
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0288l.a aVar6 = C0288l.a.this;
                int parseInt = Integer.parseInt(aVar6.f676a.f1928v.getText().toString()) + 1;
                K3.X x9 = aVar6.f676a;
                x9.f1928v.setText(String.valueOf(parseInt));
                String str9 = (String) objectRef5.element;
                String obj = x9.f1929w.getSelectedItem().toString();
                int parseDouble2 = (int) Double.parseDouble((String) objectRef6.element);
                int parseDouble3 = (int) Double.parseDouble((String) objectRef4.element);
                C0288l c0288l3 = this;
                Products products2 = products;
                c0288l3.d(str9, aVar6, products2, obj, parseDouble2, parseDouble3);
                c0288l3.f669d.S(new ShoppingListData(new ShoppingData(Integer.parseInt(x9.f1928v.getText().toString()), c0288l3.f675m, products2.getSku(), Integer.parseInt(c0288l3.g))), x9.f1913c.isChecked(), products2);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: F3.j
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppUtil.Companion companion11 = AppUtil.INSTANCE;
                C0288l c0288l3 = this;
                Context context6 = c0288l3.f666a;
                C0288l.a aVar6 = aVar3;
                EditText txtNumbers = aVar6.f676a.f1928v;
                Intrinsics.checkNotNullExpressionValue(txtNumbers, "txtNumbers");
                companion11.clearFocus(context6, txtNumbers);
                K3.X x9 = aVar6.f676a;
                int parseInt = Integer.parseInt(x9.f1928v.getText().toString()) - 1;
                EditText editText3 = x9.f1928v;
                editText3.setText(String.valueOf(parseInt));
                String str9 = (String) objectRef5.element;
                String obj = x9.f1929w.getSelectedItem().toString();
                int parseDouble2 = (int) Double.parseDouble((String) objectRef6.element);
                int parseDouble3 = (int) Double.parseDouble((String) objectRef4.element);
                Products products2 = products;
                c0288l3.d(str9, aVar6, products2, obj, parseDouble2, parseDouble3);
                G0 g02 = c0288l3.f669d;
                UnBoxUtils.Companion companion12 = UnBoxUtils.INSTANCE;
                g02.e(companion12.getProductId(products2.getUniqueId(), products2.getEntityId()), Integer.parseInt(editText3.getText().toString()));
                c0288l3.f671f.e(companion12.getProductId(products2.getUniqueId(), products2.getEntityId()), Integer.parseInt(editText3.getText().toString()));
                g02.S(new ShoppingListData(new ShoppingData(Integer.parseInt(editText3.getText().toString()), c0288l3.f675m, products2.getSku(), Integer.parseInt(c0288l3.g))), x9.f1913c.isChecked(), products2);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View findChildViewById;
        View inflate = defpackage.a.c(viewGroup, "parent").inflate(com.mobile.gro247.j.ar_shopping_product_list_item_view, viewGroup, false);
        int i3 = com.mobile.gro247.i.available_order_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, i3);
        if (textView != null) {
            i3 = com.mobile.gro247.i.barrier;
            if (((Barrier) ViewBindings.findChildViewById(inflate, i3)) != null) {
                i3 = com.mobile.gro247.i.checkProduct;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(inflate, i3);
                if (checkBox != null) {
                    i3 = com.mobile.gro247.i.discount;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, i3);
                    if (textView2 != null) {
                        i3 = com.mobile.gro247.i.imageViewProduct;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(inflate, i3);
                        if (appCompatImageView != null) {
                            i3 = com.mobile.gro247.i.imgMinus;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, i3);
                            if (imageView != null) {
                                i3 = com.mobile.gro247.i.imgPlus;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(inflate, i3);
                                if (imageView2 != null && (findChildViewById = ViewBindings.findChildViewById(inflate, (i3 = com.mobile.gro247.i.incOutOfStock))) != null) {
                                    Z2 a6 = Z2.a(findChildViewById);
                                    i3 = com.mobile.gro247.i.iv_tag1;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(inflate, i3);
                                    if (appCompatTextView != null) {
                                        i3 = com.mobile.gro247.i.iv_tag2;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(inflate, i3);
                                        if (appCompatTextView2 != null) {
                                            i3 = com.mobile.gro247.i.mrp_price;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, i3);
                                            if (textView3 != null) {
                                                i3 = com.mobile.gro247.i.parent_layout;
                                                if (((ConstraintLayout) ViewBindings.findChildViewById(inflate, i3)) != null) {
                                                    i3 = com.mobile.gro247.i.plpQuantityUpdateView;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, i3);
                                                    if (constraintLayout != null) {
                                                        i3 = com.mobile.gro247.i.product_list_item_view;
                                                        if (((ConstraintLayout) ViewBindings.findChildViewById(inflate, i3)) != null) {
                                                            i3 = com.mobile.gro247.i.product_top;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(inflate, i3);
                                                            if (constraintLayout2 != null) {
                                                                i3 = com.mobile.gro247.i.select_wishlist_image;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(inflate, i3);
                                                                if (imageView3 != null) {
                                                                    i3 = com.mobile.gro247.i.selected_wishlist_image;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(inflate, i3);
                                                                    if (imageView4 != null) {
                                                                        i3 = com.mobile.gro247.i.striked_mrp_price;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate, i3);
                                                                        if (textView4 != null) {
                                                                            i3 = com.mobile.gro247.i.tags_container;
                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(inflate, i3);
                                                                            if (constraintLayout3 != null) {
                                                                                i3 = com.mobile.gro247.i.textViewDesc;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(inflate, i3);
                                                                                if (textView5 != null) {
                                                                                    i3 = com.mobile.gro247.i.tlIndicator;
                                                                                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(inflate, i3);
                                                                                    if (tabLayout != null) {
                                                                                        i3 = com.mobile.gro247.i.top_message;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(inflate, i3);
                                                                                        if (textView6 != null) {
                                                                                            i3 = com.mobile.gro247.i.tv_minimum_quantity;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(inflate, i3);
                                                                                            if (textView7 != null) {
                                                                                                i3 = com.mobile.gro247.i.txtNumbers;
                                                                                                EditText editText = (EditText) ViewBindings.findChildViewById(inflate, i3);
                                                                                                if (editText != null) {
                                                                                                    i3 = com.mobile.gro247.i.units_spinner;
                                                                                                    AppCompatSpinner appCompatSpinner = (AppCompatSpinner) ViewBindings.findChildViewById(inflate, i3);
                                                                                                    if (appCompatSpinner != null) {
                                                                                                        i3 = com.mobile.gro247.i.vpImageSlider;
                                                                                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(inflate, i3);
                                                                                                        if (viewPager2 != null) {
                                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) inflate;
                                                                                                            K3.X binding = new K3.X(constraintLayout4, textView, checkBox, textView2, appCompatImageView, imageView, imageView2, a6, appCompatTextView, appCompatTextView2, textView3, constraintLayout, constraintLayout2, imageView3, imageView4, textView4, constraintLayout3, textView5, tabLayout, textView6, textView7, editText, appCompatSpinner, viewPager2);
                                                                                                            Intrinsics.checkNotNullExpressionValue(binding, "inflate(...)");
                                                                                                            Intrinsics.checkNotNullParameter(binding, "binding");
                                                                                                            a aVar = new a(constraintLayout4);
                                                                                                            aVar.f676a = binding;
                                                                                                            return aVar;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i;
    }
}
