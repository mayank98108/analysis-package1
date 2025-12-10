package X1;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class r extends t {
    @Override // X1.t, com.google.android.play.core.splitinstall.internal.v
    public final void m(List list) throws RemoteException {
        super.m(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0618d.n((Bundle) it.next()));
        }
        this.f7085a.d(arrayList);
    }
}
