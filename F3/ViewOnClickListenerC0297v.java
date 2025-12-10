package F3;

import K3.A2;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.mobile.gro247.model.unbox.model.Products;
import com.mobile.gro247.view.basehomescreen.BaseHomeScreen;
import com.mobile.gro247.view.productlist.MyShoppingListActivity;
import com.mobile.gro247.view.registration.PersonalInformationFragment;

/* renamed from: F3.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0297v implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f725c;

    public /* synthetic */ ViewOnClickListenerC0297v(int i, Object obj, Object obj2) {
        this.f723a = i;
        this.f724b = obj;
        this.f725c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f723a;
        Object obj = this.f725c;
        Object obj2 = this.f724b;
        switch (i) {
            case 0:
                ((D) obj2).f519d.k((Products) obj);
                break;
            case 1:
                BaseHomeScreen baseHomeScreen = (BaseHomeScreen) obj;
                boolean z = BaseHomeScreen.f16358c0;
                try {
                    baseHomeScreen.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ((Object) ((TextView) obj2).getText()))));
                    break;
                } catch (SecurityException unused) {
                    Toast.makeText(baseHomeScreen.getApplicationContext(), "An error occurred", 1).show();
                    return;
                }
            case 2:
                MyShoppingListActivity myShoppingListActivity = (MyShoppingListActivity) obj;
                int i3 = MyShoppingListActivity.f17187O0;
                ((AlertDialog) obj2).dismiss();
                myShoppingListActivity.q1(true);
                myShoppingListActivity.O0().M0(myShoppingListActivity.o1());
                break;
            default:
                PersonalInformationFragment personalInformationFragment = (PersonalInformationFragment) obj2;
                A2 a22 = (A2) obj;
                String str = personalInformationFragment.f17412d;
                if (str != null) {
                    personalInformationFragment.a0().v(a22.f1247x.getText().toString(), str);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0297v(D d6, Products products, int i) {
        this.f723a = 0;
        this.f724b = d6;
        this.f725c = products;
    }
}
