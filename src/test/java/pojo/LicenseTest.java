package pojo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LicenseTest {
    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }
}
