package F3;

import I3.C0353c;
import X0.o;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class A implements TabLayoutMediator.TabConfigurationStrategy, o.a {
    public static Parcelable a(Class cls, Parcel parcel) {
        Parcelable readParcelable = parcel.readParcelable(cls.getClassLoader());
        Intrinsics.checkNotNull(readParcelable);
        return readParcelable;
    }

    public static void b(Window window, int i) {
        window.setBackgroundDrawable(new ColorDrawable(i));
    }

    @Override // X0.o.a
    public Object apply(Object obj) {
        return (List) X0.o.n(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C0353c());
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "<unused var>");
    }
}
