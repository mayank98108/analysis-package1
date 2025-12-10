package X1;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X1.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0624j implements com.google.android.play.core.splitinstall.internal.B {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.B f7071a;

    public C0624j(com.google.android.play.core.splitinstall.internal.B b6) {
        this.f7071a = b6;
    }

    @Override // com.google.android.play.core.splitinstall.internal.B
    @Nullable
    public final Object zza() {
        File file = (File) this.f7071a.zza();
        if (file == null) {
            return null;
        }
        com.google.android.play.core.splitinstall.internal.N n = Z1.c.f7256c;
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return Z1.r.f7300a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                final Z1.c cVar = new Z1.c(newPullParser);
                cVar.a("local-testing-config", new Z1.v() { // from class: Z1.u
                    @Override // Z1.v
                    public final void zza() {
                        c cVar2 = c.this;
                        cVar2.a("split-install-errors", new t(cVar2));
                    }
                });
                Z1.d a6 = cVar.f7258b.a();
                fileReader.close();
                return a6;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e6) {
            Z1.c.f7256c.e("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e6.getMessage());
            return Z1.r.f7300a;
        }
    }
}
