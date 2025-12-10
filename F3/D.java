package F3;

import K3.E0;
import K3.G1;
import K3.H1;
import K3.K1;
import K3.L1;
import K3.a3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.mobile.gro247.MarketConstants;
import com.mobile.gro247.adapter.G0;
import com.mobile.gro247.adapter.N;
import com.mobile.gro247.model.cart.CartDetailsResponse;
import com.mobile.gro247.model.products.product.Items;
import com.mobile.gro247.model.unbox.UnboxKeys;
import com.mobile.gro247.model.unbox.model.Products;
import com.mobile.gro247.utility.AppUtil;
import com.mobile.gro247.utility.DateUtils;
import com.mobile.gro247.utility.DecimalUtils;
import com.mobile.gro247.utility.ExtensionUtilKt;
import com.mobile.gro247.utility.preferences.Preferences;
import com.mobile.gro247.utility.unbox.UnBoxCartProductUtils;
import com.mobile.gro247.utility.unbox.UnBoxPLPUtility;
import com.mobile.gro247.view.home.UserColdState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

@SourceDebugExtension({"SMAP\nUnboxProductListPageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnboxProductListPageAdapter.kt\ncom/mobile/gro247/adapter/unbox/UnboxProductListPageAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ImageViews.kt\ncoil/ImageViews\n+ 5 Contexts.kt\ncoil/Contexts\n+ 6 ImageViews.kt\ncoil/ImageViews$load$5\n*L\n1#1,1694:1\n1#2:1695\n216#3,2:1696\n216#3,2:1698\n54#4:1700\n55#4,2:1702\n97#4,5:1704\n102#4:1710\n22#4:1711\n24#4:1713\n97#4,6:1714\n12#5:1701\n12#5:1712\n55#6:1709\n*S KotlinDebug\n*F\n+ 1 UnboxProductListPageAdapter.kt\ncom/mobile/gro247/adapter/unbox/UnboxProductListPageAdapter\n*L\n720#1:1696,2\n744#1:1698,2\n853#1:1700\n853#1:1702,2\n853#1:1704,5\n853#1:1710\n855#1:1711\n855#1:1713\n855#1:1714,6\n853#1:1701\n855#1:1712\n853#1:1709\n*E\n"})
/* loaded from: classes4.dex */
public final class D extends RecyclerView.Adapter<a> implements N.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f516a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Products> f517b;

    /* renamed from: c, reason: collision with root package name */
    public CartDetailsResponse f518c;

    /* renamed from: d, reason: collision with root package name */
    public final G0 f519d;

    /* renamed from: e, reason: collision with root package name */
    public final UserColdState f520e;

    /* renamed from: f, reason: collision with root package name */
    public final String f521f;
    public ArrayList<Items> g;

    /* renamed from: h, reason: collision with root package name */
    public final Preferences f522h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f523j;

    /* renamed from: k, reason: collision with root package name */
    public String f524k;
    public int l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f525m;
    public String n;

    /* renamed from: o, reason: collision with root package name */
    public String f526o;

    /* renamed from: p, reason: collision with root package name */
    public String f527p;

    /* renamed from: q, reason: collision with root package name */
    public String f528q;

    /* renamed from: r, reason: collision with root package name */
    public Double f529r;

    /* renamed from: s, reason: collision with root package name */
    public Double f530s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f531t;

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public E0 f532a;

        public a() {
            throw null;
        }
    }

    public D(Context context, List itemsList, CartDetailsResponse cartDetailsResponse, G0 listener, UserColdState userColdState, String category, ArrayList shoppingListDataResponseList, InterfaceC0290n idListener) {
        Double valueOf = Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemsList, "itemsList");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(userColdState, "userColdState");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(shoppingListDataResponseList, "shoppingListDataResponseList");
        Intrinsics.checkNotNullParameter(idListener, "idListener");
        this.f516a = context;
        this.f517b = itemsList;
        this.f518c = cartDetailsResponse;
        this.f519d = listener;
        this.f520e = userColdState;
        this.f521f = category;
        this.g = shoppingListDataResponseList;
        this.f522h = context != null ? new Preferences(context) : null;
        new ArrayList();
        this.f525m = true;
        this.f529r = valueOf;
        this.f530s = valueOf;
        this.f531t = 0;
    }

    public static void i(a aVar, Products products) {
        if (Intrinsics.areEqual(products.getTypeId(), "bundle")) {
            ConstraintLayout viewMoreLayout = aVar.f532a.f1422S;
            Intrinsics.checkNotNullExpressionValue(viewMoreLayout, "viewMoreLayout");
            ExtensionUtilKt.showView(viewMoreLayout);
        } else {
            ConstraintLayout viewMoreLayout2 = aVar.f532a.f1422S;
            Intrinsics.checkNotNullExpressionValue(viewMoreLayout2, "viewMoreLayout");
            ExtensionUtilKt.hideView(viewMoreLayout2);
        }
    }

    public static void j(boolean z, boolean z6, boolean z7, a aVar) {
        E0 e02 = aVar.f532a;
        CheckBox checkBox = e02.f1430h;
        ConstraintLayout constraintLayout = e02.f1429f.f1499b;
        ConstraintLayout constraintLayout2 = e02.g.f1526b;
        ConstraintLayout constraintLayout3 = e02.f1432k.f1660b;
        ConstraintLayout constraintLayout4 = e02.f1431j.f1644b;
        checkBox.setChecked(z);
        if (z7) {
            constraintLayout4.setVisibility(0);
            constraintLayout3.setVisibility(8);
        } else {
            constraintLayout4.setVisibility(8);
            constraintLayout3.setVisibility(0);
        }
        if (z6) {
            constraintLayout2.setVisibility(8);
            constraintLayout.setVisibility(0);
        } else {
            constraintLayout2.setVisibility(0);
            constraintLayout.setVisibility(8);
        }
    }

    @Override // com.mobile.gro247.adapter.N.a
    public final void a(Object any, String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(any, "any");
        this.f519d.a(any, sku);
    }

    public final Integer b(a aVar, Products products, String str) {
        String c6 = c(aVar, products, false);
        Context context = this.f516a;
        if (!Intrinsics.areEqual(c6, context != null ? context.getString(com.mobile.gro247.l.ar_unit) : null)) {
            if (!Intrinsics.areEqual(c(aVar, products, false), context != null ? context.getString(com.mobile.gro247.l.ar_unit_weight) : null)) {
                if (!Intrinsics.areEqual(c(aVar, products, false), context != null ? context.getString(com.mobile.gro247.l.ar_cases) : null)) {
                    return Integer.valueOf(androidx.compose.animation.a.a(aVar.f532a.n) * (str != null ? (int) ExtensionUtilKt.toDouble(str) : 1));
                }
                int a6 = androidx.compose.animation.a.a(aVar.f532a.n);
                String nbItemsCase = products.getNbItemsCase();
                return Integer.valueOf(a6 * (nbItemsCase != null ? (int) ExtensionUtilKt.toDouble(nbItemsCase) : 1));
            }
        }
        AppUtil.Companion companion = AppUtil.INSTANCE;
        EditText edNumber = aVar.f532a.n;
        Intrinsics.checkNotNullExpressionValue(edNumber, "edNumber");
        return Integer.valueOf(companion.checkEmptyEdittext(edNumber));
    }

    public final String c(a aVar, Products products, boolean z) {
        UnBoxPLPUtility.Companion companion = UnBoxPLPUtility.INSTANCE;
        Context context = this.f516a;
        Intrinsics.checkNotNull(context);
        companion.readQuantityList(products, context, this.i, this.f523j, this.f524k);
        Context context2 = this.f516a;
        if (z) {
            String string = context2.getString(com.mobile.gro247.l.ar_combo);
            return string == null ? "Combo" : string;
        }
        if (aVar.f532a.f1429f.f1499b.getVisibility() == 0) {
            String string2 = context2.getString(com.mobile.gro247.l.ar_package);
            return string2 == null ? "Bulto" : string2;
        }
        if (aVar.f532a.f1431j.f1644b.getVisibility() == 0) {
            String string3 = context2.getString(com.mobile.gro247.l.ar_cases);
            return string3 == null ? "Caja" : string3;
        }
        String str = this.f523j;
        if (str != null && !kotlin.text.p.D(str)) {
            String str2 = this.f523j;
            if ((str2 != null ? ExtensionUtilKt.toDouble(str2) : 0.0d) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                String string4 = context2.getString(com.mobile.gro247.l.ar_unit_weight);
                return string4 == null ? "unidades pesables" : string4;
            }
        }
        String string5 = context2.getString(com.mobile.gro247.l.ar_unit);
        return string5 == null ? "Unidad" : string5;
    }

    public final void d(a aVar, Products products, String str, String str2, String str3, String str4, boolean z) {
        Integer valueOf;
        String nbItemsCase;
        E0 e02 = aVar.f532a;
        if (str == null || str.length() == 0) {
            return;
        }
        UnBoxPLPUtility.Companion companion = UnBoxPLPUtility.INSTANCE;
        Context context = this.f516a;
        Intrinsics.checkNotNull(context);
        ArrayList<String> readQuantityList = companion.readQuantityList(products, context, str3, this.f523j, str);
        String c6 = c(aVar, products, false);
        int i = com.mobile.gro247.l.ar_unit;
        Context context2 = this.f516a;
        if ((Intrinsics.areEqual(c6, context2.getString(i)) || Intrinsics.areEqual(c(aVar, products, false), context2.getString(com.mobile.gro247.l.ar_unit_weight))) && !readQuantityList.contains(context2.getString(com.mobile.gro247.l.ar_package))) {
            if (z) {
                e02.n.setText(str4);
            } else {
                e02.n.setText(Integer.valueOf((int) ExtensionUtilKt.toDouble(str)).toString());
            }
            Integer valueOf2 = Integer.valueOf((int) ExtensionUtilKt.toDouble(str));
            Intrinsics.checkNotNull(valueOf2);
            if (valueOf2.intValue() > 1) {
                TextView minimumOrderText = e02.f1440u;
                Intrinsics.checkNotNullExpressionValue(minimumOrderText, "minimumOrderText");
                ExtensionUtilKt.showView(minimumOrderText);
                TextView textView = e02.f1440u;
                StringBuilder sb = new StringBuilder();
                sb.append(context2.getString(com.mobile.gro247.l.ar_pdp_minimum_qty_text));
                sb.append(' ');
                sb.append(Integer.valueOf((int) ExtensionUtilKt.toDouble(str)));
                sb.append(' ');
                AppUtil.Companion companion2 = AppUtil.INSTANCE;
                String c7 = c(aVar, products, false);
                Integer valueOf3 = Integer.valueOf((int) ExtensionUtilKt.toDouble(str));
                Intrinsics.checkNotNull(valueOf3);
                sb.append(companion2.getCalculatedUOM(c7, valueOf3.intValue(), context2));
                textView.setText(sb.toString());
            } else {
                TextView minimumOrderText2 = e02.f1440u;
                Intrinsics.checkNotNullExpressionValue(minimumOrderText2, "minimumOrderText");
                ExtensionUtilKt.hideView(minimumOrderText2);
            }
        } else {
            if (Intrinsics.areEqual(c(aVar, products, false), context2.getString(com.mobile.gro247.l.ar_cases))) {
                Double valueOf4 = (products == null || (nbItemsCase = products.getNbItemsCase()) == null) ? null : Double.valueOf(Math.ceil(ExtensionUtilKt.divSafe(ExtensionUtilKt.toDouble(str), ExtensionUtilKt.toDouble(nbItemsCase))));
                this.f529r = valueOf4;
                if (z) {
                    e02.n.setText(String.valueOf((int) Math.ceil(ExtensionUtilKt.divSafe(ExtensionUtilKt.toDouble(str4), ExtensionUtilKt.toDouble(products.getNbItemsCase())))));
                } else {
                    e02.n.setText(valueOf4 != null ? Integer.valueOf((int) valueOf4.doubleValue()).toString() : null);
                }
                Double d6 = this.f529r;
                if (d6 != null) {
                    Integer valueOf5 = Integer.valueOf((int) d6.doubleValue());
                    Intrinsics.checkNotNull(valueOf5);
                    if (valueOf5.intValue() > 1) {
                        TextView minimumOrderText3 = e02.f1440u;
                        Intrinsics.checkNotNullExpressionValue(minimumOrderText3, "minimumOrderText");
                        ExtensionUtilKt.showView(minimumOrderText3);
                        TextView textView2 = e02.f1440u;
                        StringBuilder sb2 = new StringBuilder();
                        O3.a.c(context2, com.mobile.gro247.l.ar_pdp_minimum_qty_text, sb2, ' ');
                        Double d7 = this.f529r;
                        sb2.append(d7 != null ? Integer.valueOf((int) d7.doubleValue()) : null);
                        sb2.append(' ');
                        AppUtil.Companion companion3 = AppUtil.INSTANCE;
                        String c8 = c(aVar, products, false);
                        Double d8 = this.f529r;
                        valueOf = d8 != null ? Integer.valueOf((int) d8.doubleValue()) : null;
                        Intrinsics.checkNotNull(valueOf);
                        sb2.append(companion3.getCalculatedUOM(c8, valueOf.intValue(), context2));
                        textView2.setText(sb2.toString());
                    }
                }
                TextView minimumOrderText4 = e02.f1440u;
                Intrinsics.checkNotNullExpressionValue(minimumOrderText4, "minimumOrderText");
                ExtensionUtilKt.hideView(minimumOrderText4);
            } else {
                Double valueOf6 = str3 != null ? Double.valueOf(Math.ceil(ExtensionUtilKt.divSafe(ExtensionUtilKt.toDouble(str), ExtensionUtilKt.toDouble(str3)))) : null;
                this.f530s = valueOf6;
                if (z) {
                    e02.n.setText(String.valueOf((int) ExtensionUtilKt.divSafe(ExtensionUtilKt.toDouble(str4), str3 != null ? ExtensionUtilKt.toDouble(str3) : 1.0d)));
                } else {
                    e02.n.setText(valueOf6 != null ? Integer.valueOf((int) valueOf6.doubleValue()).toString() : null);
                }
                Double d9 = this.f530s;
                if (d9 != null) {
                    Integer valueOf7 = Integer.valueOf((int) d9.doubleValue());
                    Intrinsics.checkNotNull(valueOf7);
                    if (valueOf7.intValue() > 1) {
                        TextView minimumOrderText5 = e02.f1440u;
                        Intrinsics.checkNotNullExpressionValue(minimumOrderText5, "minimumOrderText");
                        ExtensionUtilKt.showView(minimumOrderText5);
                        TextView textView3 = e02.f1440u;
                        StringBuilder sb3 = new StringBuilder();
                        O3.a.c(context2, com.mobile.gro247.l.ar_pdp_minimum_qty_text, sb3, ' ');
                        Double d10 = this.f530s;
                        sb3.append(d10 != null ? Integer.valueOf((int) d10.doubleValue()) : null);
                        sb3.append(' ');
                        AppUtil.Companion companion4 = AppUtil.INSTANCE;
                        String c9 = c(aVar, products, false);
                        Double d11 = this.f530s;
                        valueOf = d11 != null ? Integer.valueOf((int) d11.doubleValue()) : null;
                        Intrinsics.checkNotNull(valueOf);
                        sb3.append(companion4.getCalculatedUOM(c9, valueOf.intValue(), context2));
                        textView3.setText(sb3.toString());
                    }
                }
                TextView minimumOrderText6 = e02.f1440u;
                Intrinsics.checkNotNullExpressionValue(minimumOrderText6, "minimumOrderText");
                ExtensionUtilKt.hideView(minimumOrderText6);
            }
        }
        g(aVar, products, str, str2, str3, str4, z);
    }

    public final void e(a aVar, Products products) {
        E0 e02 = aVar.f532a;
        UnBoxPLPUtility.Companion companion = UnBoxPLPUtility.INSTANCE;
        Context context = this.f516a;
        Intrinsics.checkNotNull(context);
        ArrayList<String> readQuantityList = companion.readQuantityList(products, context, this.i, this.f523j, this.f524k);
        if (readQuantityList.size() == 1) {
            if (readQuantityList.contains(context.getString(com.mobile.gro247.l.ar_package))) {
                ConstraintLayout constraintLayout = e02.f1428e;
                G1 g12 = e02.f1429f;
                H1 h12 = e02.g;
                CheckBox checkBox = e02.f1430h;
                constraintLayout.setEnabled(true);
                ConstraintLayout cbBulto = e02.f1428e;
                Intrinsics.checkNotNullExpressionValue(cbBulto, "cbBulto");
                ExtensionUtilKt.showView(cbBulto);
                checkBox.setChecked(false);
                checkBox.setVisibility(8);
                h12.f1526b.setVisibility(8);
                g12.f1499b.setVisibility(0);
                TextView textView = g12.f1500c;
                StringBuilder sb = new StringBuilder("(");
                String str = this.i;
                sb.append(str != null ? Integer.valueOf((int) ExtensionUtilKt.toDouble(str)).toString() : null);
                sb.append(" uni)");
                textView.setText(sb.toString());
                TextView textView2 = h12.f1527c;
                StringBuilder sb2 = new StringBuilder("(");
                String str2 = this.i;
                sb2.append(str2 != null ? Integer.valueOf((int) ExtensionUtilKt.toDouble(str2)).toString() : null);
                sb2.append(" uni)");
                textView2.setText(sb2.toString());
            } else {
                CheckBox checkBox2 = e02.f1430h;
                checkBox2.setEnabled(true);
                ConstraintLayout cbBulto2 = e02.f1428e;
                Intrinsics.checkNotNullExpressionValue(cbBulto2, "cbBulto");
                ExtensionUtilKt.hideView(cbBulto2);
                checkBox2.setChecked(true);
                checkBox2.setVisibility(0);
                e02.g.f1526b.setVisibility(8);
                e02.f1429f.f1499b.setVisibility(8);
            }
            e02.i.setVisibility(4);
            e02.f1431j.f1644b.setVisibility(4);
            e02.f1432k.f1660b.setVisibility(4);
            return;
        }
        if (readQuantityList.contains(context.getString(com.mobile.gro247.l.ar_package))) {
            ConstraintLayout constraintLayout2 = e02.f1428e;
            G1 g13 = e02.f1429f;
            H1 h13 = e02.g;
            CheckBox checkBox3 = e02.f1430h;
            constraintLayout2.setEnabled(true);
            ConstraintLayout cbBulto3 = e02.f1428e;
            Intrinsics.checkNotNullExpressionValue(cbBulto3, "cbBulto");
            ExtensionUtilKt.showView(cbBulto3);
            checkBox3.setChecked(false);
            checkBox3.setVisibility(8);
            h13.f1526b.setVisibility(8);
            g13.f1499b.setVisibility(0);
            TextView textView3 = g13.f1500c;
            StringBuilder sb3 = new StringBuilder("(");
            String str3 = this.i;
            sb3.append(str3 != null ? Integer.valueOf((int) ExtensionUtilKt.toDouble(str3)).toString() : null);
            sb3.append(" uni)");
            textView3.setText(sb3.toString());
            TextView textView4 = h13.f1527c;
            StringBuilder sb4 = new StringBuilder("(");
            String str4 = this.i;
            sb4.append(str4 != null ? Integer.valueOf((int) ExtensionUtilKt.toDouble(str4)).toString() : null);
            sb4.append(" uni)");
            textView4.setText(sb4.toString());
        } else {
            CheckBox checkBox4 = e02.f1430h;
            checkBox4.setEnabled(true);
            ConstraintLayout cbBulto4 = e02.f1428e;
            Intrinsics.checkNotNullExpressionValue(cbBulto4, "cbBulto");
            ExtensionUtilKt.hideView(cbBulto4);
            checkBox4.setChecked(true);
            checkBox4.setVisibility(0);
            e02.g.f1526b.setVisibility(8);
            e02.f1429f.f1499b.setVisibility(8);
        }
        ConstraintLayout constraintLayout3 = e02.i;
        L1 l12 = e02.f1432k;
        K1 k12 = e02.f1431j;
        constraintLayout3.setEnabled(true);
        e02.i.setVisibility(0);
        k12.f1644b.setVisibility(8);
        l12.f1660b.setVisibility(0);
        k12.f1645c.setText("(" + products.getNbItemsCase() + " uni)");
        l12.f1661c.setText("(" + products.getNbItemsCase() + " uni)");
    }

    public final void f(a aVar, final Products products) {
        HashMap<Integer, String> sellerStatus;
        Preferences preferences;
        HashMap<Integer, String> sellerStatus2;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        final E0 e02 = aVar.f532a;
        AppUtil.Companion companion = AppUtil.INSTANCE;
        Preferences preferences2 = this.f522h;
        String sellerFilter = companion.getSellerFilter(preferences2 != null ? preferences2.getSellerStatus() : null);
        if (sellerFilter == null || sellerFilter.length() == 0) {
            TextView mrpPrice = e02.f1441v;
            Intrinsics.checkNotNullExpressionValue(mrpPrice, "mrpPrice");
            ExtensionUtilKt.invisibleView(mrpPrice);
            e02.f1410G.setVisibility(8);
            TextView discount = e02.l;
            Intrinsics.checkNotNullExpressionValue(discount, "discount");
            ExtensionUtilKt.invisibleView(discount);
            return;
        }
        ArrayList<UnboxKeys> unboxKeys = products.getUnboxKeys();
        String parsedSellerValue = unboxKeys != null ? companion.getParsedSellerValue("sellerRegularPrice", products, unboxKeys, "_unx_d") : null;
        ArrayList<UnboxKeys> unboxKeys2 = products.getUnboxKeys();
        String parsedSellerValue2 = unboxKeys2 != null ? companion.getParsedSellerValue("sellerFinalPrice", products, unboxKeys2, "_unx_d") : null;
        ArrayList<UnboxKeys> unboxKeys3 = products.getUnboxKeys();
        String parsedSellerValue3 = unboxKeys3 != null ? companion.getParsedSellerValue("sellerPriceIsOffer", products, unboxKeys3, "_unx_ts") : null;
        ArrayList<UnboxKeys> unboxKeys4 = products.getUnboxKeys();
        String parsedSellerValue4 = unboxKeys4 != null ? companion.getParsedSellerValue("sellerDiscountPrdPerct", products, unboxKeys4, "_unx_d") : null;
        ArrayList<UnboxKeys> unboxKeys5 = products.getUnboxKeys();
        if (unboxKeys5 != null) {
            companion.getParsedSellerValue("sellerTierPrice", products, unboxKeys5, "_unx_tsm");
        }
        ArrayList<UnboxKeys> unboxKeys6 = products.getUnboxKeys();
        this.i = unboxKeys6 != null ? companion.getParsedSellerValue("sellerQtyEanUnit", products, unboxKeys6, "_unx_d") : null;
        ArrayList<UnboxKeys> unboxKeys7 = products.getUnboxKeys();
        this.f523j = unboxKeys7 != null ? companion.getParsedSellerValue("sellerQtyEanKg", products, unboxKeys7, "_unx_d") : null;
        ArrayList<UnboxKeys> unboxKeys8 = products.getUnboxKeys();
        this.f524k = unboxKeys8 != null ? companion.getParsedSellerValue("sellerMinSellQty", products, unboxKeys8, "_unx_d") : null;
        ArrayList<UnboxKeys> unboxKeys9 = products.getUnboxKeys();
        this.f526o = unboxKeys9 != null ? companion.getParsedSellerValue("sellerUnitOfMeasure", products, unboxKeys9, "_unx_ts") : null;
        ArrayList<UnboxKeys> unboxKeys10 = products.getUnboxKeys();
        this.n = unboxKeys10 != null ? companion.getParsedSellerValue("sellerStockQty", products, unboxKeys10, "_unx_d") : null;
        ArrayList<UnboxKeys> unboxKeys11 = products.getUnboxKeys();
        if (unboxKeys11 != null) {
            companion.getParsedSellerValue("sellerQtyEanUom", products, unboxKeys11, "_unx_d");
        }
        ArrayList<UnboxKeys> unboxKeys12 = products.getUnboxKeys();
        this.f527p = unboxKeys12 != null ? companion.getParsedSellerValue("sellerMaxSellQty", products, unboxKeys12, "_unx_d") : null;
        if (!Intrinsics.areEqual(parsedSellerValue3, "true") || parsedSellerValue2 == null || parsedSellerValue2.length() == 0) {
            ConstraintLayout constraintLayout = e02.f1442w;
            TextView textView = e02.f1441v;
            constraintLayout.setVisibility(8);
            e02.f1410G.setVisibility(8);
            if (preferences2 != null && (sellerStatus = preferences2.getSellerStatus()) != null) {
                for (Map.Entry<Integer, String> entry : sellerStatus.entrySet()) {
                    if ((Intrinsics.areEqual(entry.getValue(), "0") || Intrinsics.areEqual(entry.getValue(), "1")) && !Intrinsics.areEqual(parsedSellerValue, parsedSellerValue2)) {
                        MarketConstants.Companion companion2 = MarketConstants.f15574a;
                        androidx.compose.foundation.layout.b.b(AppUtil.INSTANCE, parsedSellerValue2, parsedSellerValue, textView);
                    } else {
                        MarketConstants.Companion companion3 = MarketConstants.f15574a;
                        androidx.compose.foundation.layout.b.b(AppUtil.INSTANCE, parsedSellerValue2, parsedSellerValue, textView);
                    }
                }
            }
        } else {
            String[] offerDesc = products.getOfferDesc();
            if (offerDesc == null || offerDesc.length == 0) {
                preferences = preferences2;
                e02.f1442w.setVisibility(8);
            } else {
                String[] offerDesc2 = products.getOfferDesc();
                int length = offerDesc2.length;
                int i = 0;
                boolean z6 = false;
                while (true) {
                    if (i >= length) {
                        preferences = preferences2;
                        break;
                    }
                    String str5 = offerDesc2[i];
                    AppUtil.Companion companion4 = AppUtil.INSTANCE;
                    Map<String, String> convertStringToMap = companion4.convertStringToMap(str5);
                    String[] strArr = offerDesc2;
                    if (convertStringToMap == null || (str = convertStringToMap.get("sellers")) == null) {
                        str = "";
                    }
                    List<String> convertStringToArray = companion4.convertStringToArray(str);
                    preferences = preferences2;
                    if (convertStringToMap == null || (str2 = convertStringToMap.get("customer_group")) == null) {
                        str2 = "";
                    }
                    boolean I5 = kotlin.collections.o.I(preferences != null ? preferences.getCustomerGroupUId() : null, companion4.convertStringToArray(str2));
                    HashMap<Integer, String> sellerStatus3 = preferences != null ? preferences.getSellerStatus() : null;
                    Intrinsics.checkNotNull(sellerStatus3);
                    Iterator<Map.Entry<Integer, String>> it = sellerStatus3.entrySet().iterator();
                    while (true) {
                        z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        boolean z7 = I5;
                        if (convertStringToArray.contains(String.valueOf(it.next().getKey().intValue()))) {
                            z6 = true;
                        }
                        I5 = z7;
                    }
                    boolean z8 = I5;
                    String str6 = convertStringToMap != null ? convertStringToMap.get("start_date") : null;
                    String str7 = convertStringToMap != null ? convertStringToMap.get("end_date") : null;
                    DateUtils dateUtils = DateUtils.INSTANCE;
                    if (str6 == null) {
                        str6 = "";
                    }
                    if (str7 == null) {
                        str7 = "";
                    }
                    boolean checkDate = dateUtils.checkDate(str6, str7);
                    String str8 = convertStringToMap != null ? convertStringToMap.get("device") : null;
                    if (!Intrinsics.areEqual(str8, "0") && !Intrinsics.areEqual(str8, ExifInterface.GPS_MEASUREMENT_2D)) {
                        z = false;
                    }
                    if (checkDate && z6 && z8) {
                        if (convertStringToMap == null || (str3 = convertStringToMap.get("desc")) == null) {
                            str3 = "";
                        }
                        if (str3.length() > 0 && z) {
                            e02.f1442w.setVisibility(0);
                            TextView textView2 = e02.f1443x;
                            if (convertStringToMap == null || (str4 = convertStringToMap.get("desc")) == null) {
                                str4 = "";
                            }
                            textView2.setText(str4);
                        }
                    }
                    e02.f1442w.setVisibility(4);
                    i++;
                    offerDesc2 = strArr;
                    preferences2 = preferences;
                }
            }
            if (preferences != null && (sellerStatus2 = preferences.getSellerStatus()) != null) {
                for (Map.Entry<Integer, String> entry2 : sellerStatus2.entrySet()) {
                    if ((Intrinsics.areEqual(entry2.getValue(), "0") || Intrinsics.areEqual(entry2.getValue(), "1")) && !Intrinsics.areEqual(parsedSellerValue, parsedSellerValue2)) {
                        TextView strikedMrpPrice = e02.f1410G;
                        Intrinsics.checkNotNullExpressionValue(strikedMrpPrice, "strikedMrpPrice");
                        ExtensionUtilKt.showView(strikedMrpPrice);
                        TextView textView3 = e02.f1410G;
                        textView3.setPaintFlags(textView3.getPaintFlags() | 16);
                        MarketConstants.Companion companion5 = MarketConstants.f15574a;
                        textView3.setText(MarketConstants.Companion.f((parsedSellerValue == null || parsedSellerValue.length() == 0) ? AudioStats.AUDIO_AMPLITUDE_NONE : ExtensionUtilKt.toDouble(parsedSellerValue)));
                    }
                    TextView textView4 = e02.f1441v;
                    MarketConstants.Companion companion6 = MarketConstants.f15574a;
                    androidx.compose.foundation.layout.b.b(AppUtil.INSTANCE, parsedSellerValue2, parsedSellerValue, textView4);
                }
            }
        }
        if (parsedSellerValue4 == null || parsedSellerValue4.length() == 0) {
            TextView discount2 = e02.l;
            Intrinsics.checkNotNullExpressionValue(discount2, "discount");
            ExtensionUtilKt.hideView(discount2);
        } else {
            TextView discount3 = e02.l;
            Intrinsics.checkNotNullExpressionValue(discount3, "discount");
            ExtensionUtilKt.showView(discount3);
            TextView textView5 = e02.l;
            StringBuilder sb = new StringBuilder("-");
            double d6 = ExtensionUtilKt.toDouble(parsedSellerValue4);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(DecimalUtils.INSTANCE.roundOfDiscountValue(d6));
            Context context = this.f516a;
            sb2.append(context != null ? context.getString(com.mobile.gro247.l.percent_sign) : null);
            sb2.append(' ');
            sb2.append(context != null ? context.getString(com.mobile.gro247.l.discount_off) : null);
            sb.append(sb2.toString());
            textView5.setText(sb.toString());
        }
        e02.f1407D.setOnClickListener(new View.OnClickListener() { // from class: F3.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                G0 g02 = D.this.f519d;
                Products products2 = products;
                String sku = products2.getSku();
                if (sku == null) {
                    sku = "";
                }
                g02.a(products2, sku);
                E0 e03 = e02;
                ImageView selectWishlistImage = e03.f1407D;
                Intrinsics.checkNotNullExpressionValue(selectWishlistImage, "selectWishlistImage");
                ExtensionUtilKt.hideView(selectWishlistImage);
                ImageView selectedWishlistImage = e03.f1409F;
                Intrinsics.checkNotNullExpressionValue(selectedWishlistImage, "selectedWishlistImage");
                ExtensionUtilKt.showView(selectedWishlistImage);
            }
        });
        e02.f1409F.setOnClickListener(new View.OnClickListener() { // from class: F3.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                D d7 = D.this;
                G0 g02 = d7.f519d;
                int i3 = d7.l;
                ArrayList<Items> shoppingListData = d7.g;
                Products products2 = products;
                String sku = products2 != null ? products2.getSku() : null;
                Intrinsics.checkNotNullParameter(shoppingListData, "shoppingListData");
                int i6 = 0;
                for (Items items : shoppingListData) {
                    if (Intrinsics.areEqual(items.getSku(), sku)) {
                        i6 = items.getRequisition_item_id();
                    }
                }
                g02.z(i3, i6);
                E0 e03 = e02;
                e03.f1409F.setVisibility(8);
                e03.f1407D.setVisibility(0);
            }
        });
    }

    public final void g(a aVar, Products products, String str, String str2, String str3, String str4, boolean z) {
        String nbItemsCase;
        E0 e02 = aVar.f532a;
        if (str == null || str.length() == 0) {
            return;
        }
        EditText edNumber = e02.n;
        ShapeableImageView shapeableImageView = e02.f1436q;
        ShapeableImageView shapeableImageView2 = e02.f1435p;
        String obj = edNumber.getText().toString();
        Context context = this.f516a;
        if (obj == null || obj.length() == 0) {
            shapeableImageView2.setEnabled(false);
            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus_grey) : null);
            shapeableImageView.setEnabled(false);
            shapeableImageView.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.baseline_add_24_grey) : null);
            return;
        }
        AppUtil.Companion companion = AppUtil.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(edNumber, "edNumber");
        if (companion.checkEmptyEdittext(edNumber) > 0) {
            if (!Intrinsics.areEqual(c(aVar, products, false), context != null ? context.getString(com.mobile.gro247.l.ar_unit) : null)) {
                if (!Intrinsics.areEqual(c(aVar, products, false), context != null ? context.getString(com.mobile.gro247.l.ar_unit_weight) : null)) {
                    if (Intrinsics.areEqual(c(aVar, products, false), context != null ? context.getString(com.mobile.gro247.l.ar_cases) : null)) {
                        Intrinsics.checkNotNullExpressionValue(edNumber, "edNumber");
                        int checkEmptyEdittext = companion.checkEmptyEdittext(edNumber);
                        Double d6 = this.f529r;
                        if (checkEmptyEdittext > (d6 != null ? (int) d6.doubleValue() : 1)) {
                            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus) : null);
                            shapeableImageView2.setEnabled(true);
                        } else {
                            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus_grey) : null);
                            shapeableImageView2.setEnabled(false);
                        }
                    } else {
                        Intrinsics.checkNotNullExpressionValue(edNumber, "edNumber");
                        int checkEmptyEdittext2 = companion.checkEmptyEdittext(edNumber);
                        Double d7 = this.f530s;
                        if (checkEmptyEdittext2 > (d7 != null ? (int) d7.doubleValue() : 1)) {
                            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus) : null);
                            shapeableImageView2.setEnabled(true);
                        } else {
                            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus_grey) : null);
                            shapeableImageView2.setEnabled(false);
                        }
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(edNumber, "edNumber");
            if (companion.checkEmptyEdittext(edNumber) > ((int) ExtensionUtilKt.toDouble(str))) {
                shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus) : null);
                shapeableImageView2.setEnabled(true);
            } else {
                shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus_grey) : null);
                shapeableImageView2.setEnabled(false);
            }
        } else {
            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus_grey) : null);
            shapeableImageView2.setEnabled(false);
        }
        String sku = products != null ? products.getSku() : null;
        String sku2 = (sku == null || sku.length() == 0) ? "" : products != null ? products.getSku() : null;
        this.f531t = sku2 != null ? UnBoxCartProductUtils.INSTANCE.readQuantityFromCartDetails(this.f518c, sku2) : null;
        if (!Intrinsics.areEqual(c(aVar, products, false), context != null ? context.getString(com.mobile.gro247.l.ar_unit) : null)) {
            if (!Intrinsics.areEqual(c(aVar, products, false), context != null ? context.getString(com.mobile.gro247.l.ar_unit_weight) : null)) {
                if (Intrinsics.areEqual(c(aVar, products, false), context != null ? context.getString(com.mobile.gro247.l.ar_cases) : null)) {
                    if (products == null || (nbItemsCase = products.getNbItemsCase()) == null) {
                        return;
                    }
                    companion.checkForCajaPLP(aVar.f532a, this.f516a, str2, this.f531t, nbItemsCase, c(aVar, products, false), str4, z, products.getNbItemsCase());
                    return;
                }
                E0 e03 = aVar.f532a;
                Integer num = this.f531t;
                String c6 = c(aVar, products, false);
                Intrinsics.checkNotNull(str3);
                companion.checkForBultoPLP(e03, this.f516a, str2, num, str3, c6, str4, z, str3);
                return;
            }
        }
        companion.checkForUnidadesPLP(aVar.f532a, this.f516a, (str2 == null || str2.length() == 0) ? GLUtils.VERSION_UNKNOWN : str2, this.f531t, c(aVar, products, false), str4, z, "1");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f517b.size();
    }

    public final void h(a aVar) {
        String string;
        E0 e02 = aVar.f532a;
        CheckBox checkBox = e02.f1430h;
        a3 a3Var = e02.f1419P;
        ConstraintLayout constraintLayout = a3Var.f2019a;
        if (checkBox.isChecked()) {
            TextView quantityEquivalence = e02.f1405B;
            Intrinsics.checkNotNullExpressionValue(quantityEquivalence, "quantityEquivalence");
            ExtensionUtilKt.hideView(quantityEquivalence);
            String str = this.f523j;
            if (str != null && !kotlin.text.p.D(str)) {
                String str2 = this.f523j;
                if ((str2 != null ? ExtensionUtilKt.toDouble(str2) : 0.0d) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                    ExtensionUtilKt.showView(constraintLayout);
                    TextView textView = a3Var.f2020b;
                    String str3 = null;
                    str3 = null;
                    Context context = this.f516a;
                    if (context != null && (string = context.getString(com.mobile.gro247.l.ar_unit_wight_comprassion)) != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        StringBuilder sb = new StringBuilder();
                        String str4 = this.f523j;
                        sb.append(str4 != null ? Integer.valueOf((int) ExtensionUtilKt.toDouble(str4)) : null);
                        sb.append(' ');
                        String str5 = this.f526o;
                        sb.append((str5 == null || str5.length() == 0) ? "" : String.valueOf(this.f526o));
                        str3 = androidx.camera.camera2.internal.N.e(new Object[]{sb.toString()}, 1, string, "format(...)");
                    }
                    textView.setText(str3);
                    return;
                }
            }
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ExtensionUtilKt.hideView(constraintLayout);
        }
    }

    public final Integer k(a aVar, Products products, String str) {
        String sku = products.getSku();
        String sku2 = (sku == null || sku.length() == 0) ? "" : products.getSku();
        this.f531t = sku2 != null ? UnBoxCartProductUtils.INSTANCE.readQuantityFromCartDetails(this.f518c, sku2) : null;
        return b(aVar, products, str);
    }

    @Override // com.mobile.gro247.adapter.N.a
    public final void m(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        int i = this.l;
        ArrayList<Items> shoppingListData = this.g;
        Intrinsics.checkNotNullParameter(shoppingListData, "shoppingListData");
        int i3 = 0;
        for (Items items : shoppingListData) {
            if (Intrinsics.areEqual(items.getSku(), sku)) {
                i3 = items.getRequisition_item_id();
            }
        }
        this.f519d.z(i, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x060b, code lost:
    
        if (r20.readProductStockStatusRecommendations(r13.getParsedSellerValue("sellerStockStatus", r4, r4.getUnboxKeys(), r12), r13.getParsedSellerValue(r37, r4, r4.getUnboxKeys(), r12), r13.getParsedSellerValue(r46, r4, r4.getUnboxKeys(), r12), r4.getSellerZoneId()) != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05d0, code lost:
    
        if (r1.readProductStockStatusRecommendations(r13.getParsedSellerValue("sellerStockStatus", r4, r4.getUnboxKeys(), r12), r13.getParsedSellerValue(r37, r4, r4.getUnboxKeys(), r12), r13.getParsedSellerValue(r46, r4, r4.getUnboxKeys(), r12), r4.getSellerZoneId()) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x060e, code lost:
    
        r18.setVisibility(0);
        r41.setVisibility(0);
        r6 = r16;
        r6.setVisibility(8);
        i(r3, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x056e  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.HashMap] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(F3.D.a r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.D.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        E0 binding = E0.b(LayoutInflater.from(parent.getContext()), parent);
        Intrinsics.checkNotNullExpressionValue(binding, "inflate(...)");
        Intrinsics.checkNotNullParameter(binding, "binding");
        a aVar = new a(binding.f1424a);
        aVar.f532a = binding;
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i;
    }
}
