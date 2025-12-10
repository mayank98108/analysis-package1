package X1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final Map f7023a;

    public final HashMap a(Collection collection) {
        Set unmodifiableSet;
        HashMap hashMap = new HashMap();
        Map map = this.f7023a;
        for (String str : map.keySet()) {
            if (map.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) map.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                unmodifiableSet = Collections.EMPTY_SET;
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }
}
