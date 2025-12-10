package X1;

import android.content.res.XmlResourceParser;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class y {
    @Nullable
    public static final String a(String str, XmlResourceParser xmlResourceParser) {
        for (int i = 0; i < xmlResourceParser.getAttributeCount(); i++) {
            if (xmlResourceParser.getAttributeName(i).equals(str)) {
                return xmlResourceParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final void b(XmlResourceParser xmlResourceParser) throws IOException, XmlPullParserException {
        int i = 1;
        while (i != 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
