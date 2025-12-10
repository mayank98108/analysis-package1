package X1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7022a = new HashMap();

    public final void a(String str, String str2, String str3) {
        HashMap hashMap = this.f7022a;
        if (!hashMap.containsKey(str2)) {
            hashMap.put(str2, new HashMap());
        }
        ((Map) hashMap.get(str2)).put(str, str3);
    }

    public final E b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f7022a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new E(Collections.unmodifiableMap(hashMap));
    }
}
