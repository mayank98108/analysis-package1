package F3;

import F3.V;
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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.camera.camera2.internal.K0;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.mobile.gro247.adapter.N;
import com.mobile.gro247.model.cart.CartDetailsResponse;
import com.mobile.gro247.model.products.product.Items;
import com.mobile.gro247.model.unbox.items.Recommendations;
import com.mobile.gro247.utility.AppUtil;
import com.mobile.gro247.utility.ExtensionUtilKt;
import com.mobile.gro247.utility.preferences.Preferences;
import com.mobile.gro247.utility.unbox.UnBoxCartProductUtils;
import com.mobile.gro247.utility.unbox.UnBoxPLPUtility;
import com.mobile.gro247.view.home.UserColdState;
import com.mobile.gro247.view.home.adapter.callback.HomeScreenEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

@SourceDebugExtension({"SMAP\nUnboxSmartListPageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnboxSmartListPageAdapter.kt\ncom/mobile/gro247/adapter/unbox/UnboxSmartListPageAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ImageViews.kt\ncoil/ImageViews\n+ 5 Contexts.kt\ncoil/Contexts\n+ 6 ImageViews.kt\ncoil/ImageViews$load$5\n*L\n1#1,1602:1\n1#2:1603\n216#3,2:1604\n216#3,2:1606\n54#4:1608\n55#4,2:1610\n97#4,5:1612\n102#4:1618\n22#4:1619\n24#4:1621\n97#4,6:1622\n12#5:1609\n12#5:1620\n55#6:1617\n*S KotlinDebug\n*F\n+ 1 UnboxSmartListPageAdapter.kt\ncom/mobile/gro247/adapter/unbox/UnboxSmartListPageAdapter\n*L\n535#1:1604,2\n559#1:1606,2\n653#1:1608\n653#1:1610,2\n653#1:1612,5\n653#1:1618\n655#1:1619\n655#1:1621\n655#1:1622,6\n653#1:1609\n655#1:1620\n653#1:1617\n*E\n"})
/* loaded from: classes4.dex */
public final class V extends RecyclerView.Adapter<b> implements N.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f602a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Recommendations> f603b;

    /* renamed from: c, reason: collision with root package name */
    public final HomeScreenEvent f604c;

    /* renamed from: d, reason: collision with root package name */
    public CartDetailsResponse f605d;

    /* renamed from: e, reason: collision with root package name */
    public final a f606e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<Items> f607f;
    public final Preferences g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<Items> f608h;
    public final ArrayList<Integer> i;

    /* renamed from: j, reason: collision with root package name */
    public String f609j;

    /* renamed from: k, reason: collision with root package name */
    public String f610k;
    public String l;

    /* renamed from: m, reason: collision with root package name */
    public String f611m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f612o;

    /* renamed from: p, reason: collision with root package name */
    public String f613p;

    /* renamed from: q, reason: collision with root package name */
    public String f614q;

    /* renamed from: r, reason: collision with root package name */
    public String f615r;

    /* renamed from: s, reason: collision with root package name */
    public String f616s;

    /* renamed from: t, reason: collision with root package name */
    public Double f617t;

    /* renamed from: u, reason: collision with root package name */
    public Double f618u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f619v;

    public interface a {
        void a(Object obj, String str);

        void b0(Recommendations recommendations, int i, int i3);

        void c(int i, String str, String str2);

        void d(int i, int i3, String str);

        void f(int i, HomeScreenEvent homeScreenEvent, int i3);

        void g(String str, String str2);

        void j(int i, Object obj, String str, String str2);

        void l(int i, int i3, Object obj);

        void m(int i, List list);
    }

    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public E0 f620a;
    }

    public V(Context context, List product, HomeScreenEvent eventType, com.mobile.gro247.view.home.adapter.callback.c onItemClickListener, UserColdState userColdState, CartDetailsResponse cartDetailsResponse, a listener, ArrayList shoppingListDataResponseList, F idListener) {
        Double valueOf = Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        Intrinsics.checkNotNullParameter(userColdState, "userColdState");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(shoppingListDataResponseList, "shoppingListDataResponseList");
        Intrinsics.checkNotNullParameter(idListener, "idListener");
        this.f602a = context;
        this.f603b = product;
        this.f604c = eventType;
        this.f605d = cartDetailsResponse;
        this.f606e = listener;
        this.f607f = shoppingListDataResponseList;
        this.g = context != null ? new Preferences(context) : null;
        new ArrayList();
        this.f608h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.f612o = true;
        this.f617t = valueOf;
        this.f618u = valueOf;
        this.f619v = 0;
    }

    public static void i(boolean z, boolean z6, boolean z7, b bVar) {
        E0 e02 = bVar.f620a;
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
        this.f606e.a(any, sku);
    }

    public final Integer b(b bVar, Recommendations recommendations, String str) {
        String d6 = d(bVar, recommendations, false);
        Context context = this.f602a;
        if (!Intrinsics.areEqual(d6, context != null ? context.getString(com.mobile.gro247.l.ar_unit) : null)) {
            if (!Intrinsics.areEqual(d(bVar, recommendations, false), context != null ? context.getString(com.mobile.gro247.l.ar_unit_weight) : null)) {
                if (!Intrinsics.areEqual(d(bVar, recommendations, false), context != null ? context.getString(com.mobile.gro247.l.ar_cases) : null)) {
                    return Integer.valueOf(androidx.compose.animation.a.a(bVar.f620a.n) * (str != null ? (int) ExtensionUtilKt.toDouble(str) : 1));
                }
                int a6 = androidx.compose.animation.a.a(bVar.f620a.n);
                String nbItemsCase = recommendations.getNbItemsCase();
                return Integer.valueOf(a6 * (nbItemsCase != null ? (int) ExtensionUtilKt.toDouble(nbItemsCase) : 1));
            }
        }
        return Integer.valueOf(ExtensionUtilKt.toInt(bVar.f620a.n.getText().toString()));
    }

    public final void c(b bVar, Recommendations recommendations) {
        UnBoxPLPUtility.Companion companion = UnBoxPLPUtility.INSTANCE;
        AppUtil.Companion companion2 = AppUtil.INSTANCE;
        if (companion.readProductStockStatusRecommendations(companion2.getParsedSellerValue("sellerStockStatus", recommendations, recommendations.getUnboxKeys(), "_unx_d"), companion2.getParsedSellerValue("sellerStockQty", recommendations, recommendations.getUnboxKeys(), "_unx_d"), companion2.getParsedSellerValue("sellerMinSellQty", recommendations, recommendations.getUnboxKeys(), "_unx_d"), recommendations.getSellerZoneId())) {
            Preferences preferences = this.g;
            String sellerFilter = companion2.getSellerFilter(preferences != null ? preferences.getSellerStatus() : null);
            if (sellerFilter == null || sellerFilter.length() == 0) {
                E0 e02 = bVar.f620a;
                e02.f1418O.setVisibility(0);
                e02.f1437r.f2006a.setVisibility(8);
                e02.f1425b.setVisibility(0);
            } else {
                E0 e03 = bVar.f620a;
                e03.f1425b.setVisibility(8);
                e03.f1418O.setVisibility(8);
                e03.f1437r.f2006a.setVisibility(0);
            }
        } else if (recommendations.getOnlyXLeftInStock() > 0) {
            E0 e04 = bVar.f620a;
            e04.f1418O.setVisibility(0);
            e04.f1425b.setVisibility(0);
            e04.f1437r.f2006a.setVisibility(8);
        } else {
            E0 e05 = bVar.f620a;
            e05.f1418O.setVisibility(0);
            e05.f1425b.setVisibility(0);
            e05.f1437r.f2006a.setVisibility(8);
        }
        if (Intrinsics.areEqual(recommendations.getTypeId(), "bundle")) {
            ConstraintLayout viewMoreLayout = bVar.f620a.f1422S;
            Intrinsics.checkNotNullExpressionValue(viewMoreLayout, "viewMoreLayout");
            ExtensionUtilKt.showView(viewMoreLayout);
        } else {
            ConstraintLayout viewMoreLayout2 = bVar.f620a.f1422S;
            Intrinsics.checkNotNullExpressionValue(viewMoreLayout2, "viewMoreLayout");
            ExtensionUtilKt.hideView(viewMoreLayout2);
        }
    }

    public final String d(b bVar, Recommendations recommendations, boolean z) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        UnBoxPLPUtility.Companion companion = UnBoxPLPUtility.INSTANCE;
        Context context = this.f602a;
        Intrinsics.checkNotNull(context);
        companion.readQuantityList(context, recommendations, this.f609j, this.f610k, this.l);
        Context context2 = this.f602a;
        if (z) {
            return (context2 == null || (string5 = context2.getString(com.mobile.gro247.l.ar_combo)) == null) ? "Combo" : string5;
        }
        if (bVar.f620a.f1429f.f1499b.getVisibility() == 0) {
            return (context2 == null || (string4 = context2.getString(com.mobile.gro247.l.ar_package)) == null) ? "Bulto" : string4;
        }
        if (bVar.f620a.f1431j.f1644b.getVisibility() == 0) {
            return (context2 == null || (string3 = context2.getString(com.mobile.gro247.l.ar_cases)) == null) ? "Caja" : string3;
        }
        String str = this.f610k;
        if (str != null && !kotlin.text.p.D(str)) {
            String str2 = this.f610k;
            if ((str2 != null ? ExtensionUtilKt.toDouble(str2) : 0.0d) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                return (context2 == null || (string2 = context2.getString(com.mobile.gro247.l.ar_unit_weight)) == null) ? "unidades pesables" : string2;
            }
        }
        return (context2 == null || (string = context2.getString(com.mobile.gro247.l.ar_unit)) == null) ? "Unidad" : string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (kotlin.collections.o.I(r6 != null ? r6.getString(com.mobile.gro247.l.ar_package) : null, r2) == false) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(F3.V.b r17, com.mobile.gro247.model.unbox.items.Recommendations r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.V.e(F3.V$b, com.mobile.gro247.model.unbox.items.Recommendations, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void f(b bVar, Recommendations recommendations) {
        bVar.getClass();
        E0 e02 = bVar.f620a;
        UnBoxPLPUtility.Companion companion = UnBoxPLPUtility.INSTANCE;
        Context context = this.f602a;
        Intrinsics.checkNotNull(context);
        ArrayList<String> readQuantityList = companion.readQuantityList(context, recommendations, this.f609j, this.f610k, this.l);
        int size = readQuantityList.size();
        Context context2 = this.f602a;
        if (size == 1) {
            if (readQuantityList.contains(context2.getString(com.mobile.gro247.l.ar_package))) {
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
                String str = this.f609j;
                sb.append(str != null ? Integer.valueOf((int) ExtensionUtilKt.toDouble(str)).toString() : null);
                sb.append(" uni)");
                textView.setText(sb.toString());
                TextView textView2 = h12.f1527c;
                StringBuilder sb2 = new StringBuilder("(");
                String str2 = this.f609j;
                sb2.append(str2 != null ? Integer.valueOf((int) ExtensionUtilKt.toDouble(str2)).toString() : null);
                sb2.append(" uni)");
                textView2.setText(sb2.toString());
            } else {
                CheckBox checkBox2 = e02.f1430h;
                CheckBox checkBox3 = e02.f1430h;
                checkBox2.setEnabled(true);
                ConstraintLayout cbBulto2 = e02.f1428e;
                Intrinsics.checkNotNullExpressionValue(cbBulto2, "cbBulto");
                ExtensionUtilKt.hideView(cbBulto2);
                checkBox3.setChecked(true);
                checkBox3.setVisibility(0);
                e02.g.f1526b.setVisibility(8);
                e02.f1429f.f1499b.setVisibility(8);
            }
            e02.i.setVisibility(4);
            e02.f1431j.f1644b.setVisibility(4);
            e02.f1432k.f1660b.setVisibility(4);
            return;
        }
        if (readQuantityList.contains(context2.getString(com.mobile.gro247.l.ar_package))) {
            ConstraintLayout constraintLayout2 = e02.f1428e;
            G1 g13 = e02.f1429f;
            H1 h13 = e02.g;
            CheckBox checkBox4 = e02.f1430h;
            constraintLayout2.setEnabled(true);
            ConstraintLayout cbBulto3 = e02.f1428e;
            Intrinsics.checkNotNullExpressionValue(cbBulto3, "cbBulto");
            ExtensionUtilKt.showView(cbBulto3);
            checkBox4.setChecked(false);
            checkBox4.setVisibility(8);
            h13.f1526b.setVisibility(8);
            g13.f1499b.setVisibility(0);
            TextView textView3 = g13.f1500c;
            StringBuilder sb3 = new StringBuilder("(");
            String str3 = this.f609j;
            sb3.append(str3 != null ? Integer.valueOf((int) ExtensionUtilKt.toDouble(str3)).toString() : null);
            sb3.append(" uni)");
            textView3.setText(sb3.toString());
            TextView textView4 = h13.f1527c;
            StringBuilder sb4 = new StringBuilder("(");
            String str4 = this.f609j;
            sb4.append(str4 != null ? Integer.valueOf((int) ExtensionUtilKt.toDouble(str4)).toString() : null);
            sb4.append(" uni)");
            textView4.setText(sb4.toString());
        } else {
            CheckBox checkBox5 = e02.f1430h;
            CheckBox checkBox6 = e02.f1430h;
            checkBox5.setEnabled(true);
            ConstraintLayout cbBulto4 = e02.f1428e;
            Intrinsics.checkNotNullExpressionValue(cbBulto4, "cbBulto");
            ExtensionUtilKt.hideView(cbBulto4);
            checkBox6.setChecked(true);
            checkBox6.setVisibility(0);
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
        k12.f1645c.setText("(" + recommendations.getNbItemsCase() + " uni)");
        l12.f1661c.setText("(" + recommendations.getNbItemsCase() + " uni)");
    }

    public final void g(b bVar, Recommendations recommendations, String str, String str2, String str3, String str4, boolean z) {
        String nbItemsCase;
        E0 e02 = bVar.f620a;
        if (str == null || str.length() == 0) {
            return;
        }
        EditText editText = e02.n;
        ShapeableImageView shapeableImageView = e02.f1436q;
        ShapeableImageView shapeableImageView2 = e02.f1435p;
        String obj = editText.getText().toString();
        Context context = this.f602a;
        if (obj == null || obj.length() == 0) {
            shapeableImageView2.setEnabled(false);
            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus_grey) : null);
            shapeableImageView.setEnabled(false);
            shapeableImageView.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.baseline_add_24_grey) : null);
            return;
        }
        if (androidx.compose.animation.a.a(editText) > 0) {
            if (!Intrinsics.areEqual(d(bVar, recommendations, false), context != null ? context.getString(com.mobile.gro247.l.ar_unit) : null)) {
                if (!Intrinsics.areEqual(d(bVar, recommendations, false), context != null ? context.getString(com.mobile.gro247.l.ar_unit_weight) : null)) {
                    if (Intrinsics.areEqual(d(bVar, recommendations, false), context != null ? context.getString(com.mobile.gro247.l.ar_cases) : null)) {
                        int a6 = androidx.compose.animation.a.a(editText);
                        Double d6 = this.f617t;
                        if (a6 > (d6 != null ? (int) d6.doubleValue() : 1)) {
                            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus) : null);
                            shapeableImageView2.setEnabled(true);
                        } else {
                            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus_grey) : null);
                            shapeableImageView2.setEnabled(false);
                        }
                    } else {
                        int a7 = androidx.compose.animation.a.a(editText);
                        Double d7 = this.f618u;
                        if (a7 > (d7 != null ? (int) d7.doubleValue() : 1)) {
                            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus) : null);
                            shapeableImageView2.setEnabled(true);
                        } else {
                            shapeableImageView2.setImageDrawable(context != null ? context.getDrawable(com.mobile.gro247.g.ic_minus_grey) : null);
                            shapeableImageView2.setEnabled(false);
                        }
                    }
                }
            }
            if (androidx.compose.animation.a.a(editText) > ((int) ExtensionUtilKt.toDouble(str))) {
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
        String sku = recommendations != null ? recommendations.getSku() : null;
        String sku2 = (sku == null || sku.length() == 0) ? "" : recommendations != null ? recommendations.getSku() : null;
        this.f619v = sku2 != null ? UnBoxCartProductUtils.INSTANCE.readQuantityFromCartDetails(this.f605d, sku2) : null;
        if (!Intrinsics.areEqual(d(bVar, recommendations, false), context != null ? context.getString(com.mobile.gro247.l.ar_unit) : null)) {
            if (!Intrinsics.areEqual(d(bVar, recommendations, false), context != null ? context.getString(com.mobile.gro247.l.ar_unit_weight) : null)) {
                if (Intrinsics.areEqual(d(bVar, recommendations, false), context != null ? context.getString(com.mobile.gro247.l.ar_cases) : null)) {
                    if (recommendations == null || (nbItemsCase = recommendations.getNbItemsCase()) == null) {
                        return;
                    }
                    AppUtil.INSTANCE.checkForCajaPLP(bVar.f620a, this.f602a, str2, this.f619v, nbItemsCase, d(bVar, recommendations, false), str4, z, recommendations.getNbItemsCase());
                    return;
                }
                AppUtil.Companion companion = AppUtil.INSTANCE;
                E0 e03 = bVar.f620a;
                Integer num = this.f619v;
                String d8 = d(bVar, recommendations, false);
                Intrinsics.checkNotNull(str3);
                companion.checkForBultoPLP(e03, this.f602a, str2, num, str3, d8, str4, z, str3);
                return;
            }
        }
        AppUtil.INSTANCE.checkForUnidadesPLP(bVar.f620a, this.f602a, (str2 == null || str2.length() == 0) ? GLUtils.VERSION_UNKNOWN : str2, this.f619v, d(bVar, recommendations, false), str4, z, "1");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f603b.size();
    }

    public final void h(b bVar) {
        String string;
        E0 e02 = bVar.f620a;
        CheckBox checkBox = e02.f1430h;
        a3 a3Var = e02.f1419P;
        ConstraintLayout constraintLayout = a3Var.f2019a;
        if (checkBox.isChecked()) {
            TextView quantityEquivalence = e02.f1405B;
            Intrinsics.checkNotNullExpressionValue(quantityEquivalence, "quantityEquivalence");
            ExtensionUtilKt.hideView(quantityEquivalence);
            String str = this.f610k;
            if (str != null && !kotlin.text.p.D(str)) {
                String str2 = this.f610k;
                if ((str2 != null ? ExtensionUtilKt.toDouble(str2) : 0.0d) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                    ExtensionUtilKt.showView(constraintLayout);
                    TextView textView = a3Var.f2020b;
                    String str3 = null;
                    str3 = null;
                    Context context = this.f602a;
                    if (context != null && (string = context.getString(com.mobile.gro247.l.ar_unit_wight_comprassion)) != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        StringBuilder sb = new StringBuilder();
                        String str4 = this.f610k;
                        sb.append(str4 != null ? Integer.valueOf((int) ExtensionUtilKt.toDouble(str4)) : null);
                        sb.append(' ');
                        String str5 = this.f614q;
                        sb.append((str5 == null || str5.length() == 0) ? "" : String.valueOf(this.f614q));
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

    public final Integer j(b bVar, Recommendations recommendations, String str) {
        String sku = recommendations.getSku();
        String sku2 = (sku == null || sku.length() == 0) ? "" : recommendations.getSku();
        this.f619v = sku2 != null ? UnBoxCartProductUtils.INSTANCE.readQuantityFromCartDetails(this.f605d, sku2) : null;
        return b(bVar, recommendations, str);
    }

    @Override // com.mobile.gro247.adapter.N.a
    public final void m(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        int i = this.n;
        ArrayList<Items> shoppingListData = this.f607f;
        Intrinsics.checkNotNullParameter(shoppingListData, "shoppingListData");
        int i3 = 0;
        for (Items items : shoppingListData) {
            if (Intrinsics.areEqual(items.getSku(), sku)) {
                i3 = items.getRequisition_item_id();
            }
        }
        this.f606e.l(i, i3, this.f603b.get(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0722  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(F3.V.b r50, final int r51) {
        /*
            Method dump skipped, instructions count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.V.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ConstraintLayout itemView = E0.b(LayoutInflater.from(parent.getContext()), parent).f1424a;
        Intrinsics.checkNotNullExpressionValue(itemView, "getRoot(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        final b bVar = new b(itemView);
        E0 a6 = E0.a(itemView);
        Intrinsics.checkNotNullExpressionValue(a6, "bind(...)");
        bVar.f620a = a6;
        a6.f1437r.f2008c.setOnClickListener(new View.OnClickListener() { // from class: F3.W
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3;
                V v6 = V.this;
                List<Recommendations> list = v6.f603b;
                Preferences preferences = v6.g;
                V.b bVar2 = bVar;
                int adapterPosition = bVar2.getAdapterPosition();
                E0 e02 = bVar2.f620a;
                Recommendations recommendations = list.get(adapterPosition);
                V.a aVar = v6.f606e;
                int i6 = 0;
                try {
                    i3 = ExtensionUtilKt.toInt(recommendations.getUniqueId());
                } catch (Exception unused) {
                    i3 = 0;
                }
                HomeScreenEvent homeScreenEvent = v6.f604c;
                AppUtil.Companion companion = AppUtil.INSTANCE;
                aVar.f(i3, homeScreenEvent, ExtensionUtilKt.toInt(companion.getParsedSellerIdNotify("sellerStockQty", recommendations.getUnboxKeys())));
                ConstraintLayout productTop = e02.z;
                Button button = e02.f1437r.f2008c;
                Intrinsics.checkNotNullExpressionValue(productTop, "productTop");
                ExtensionUtilKt.showView(productTop);
                if (preferences != null) {
                    TextView textView = e02.f1414K;
                    String string = e02.f1424a.getContext().getString(com.mobile.gro247.l.ar_notify_message);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    K0.e(new Object[]{preferences.getUserEmail()}, 1, string, "format(...)", textView);
                }
                if (UnBoxPLPUtility.INSTANCE.readProductStockStatusRecommendationUsingSellerZoneId(v6.f611m, v6.f613p, v6.l, companion.getParsedSellerValue("sellerFinalPrice", recommendations, recommendations.getUnboxKeys(), "_unx_d"), recommendations.getSellerZoneId())) {
                    button.setEnabled(false);
                    Context context = v6.f602a;
                    button.setText(context != null ? context.getString(com.mobile.gro247.l.ar_requested_notification) : null);
                }
                ArrayList<Integer> arrayList = v6.i;
                try {
                    i6 = ExtensionUtilKt.toInt(recommendations.getUniqueId());
                } catch (Exception unused2) {
                }
                arrayList.add(Integer.valueOf(i6));
            }
        });
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i;
    }
}
