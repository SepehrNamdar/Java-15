package string;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.assertj.core.api.Assertions.assertThat;

public class StringShould {

    @Test
    void be_presented_by_text_blocks() {
        String s = "<HTML>"
                + "\n"
                + "    <BODY>"
                + "\n"
                + "        Hello World !"
                + "\n"
                + "    </BODY>"
                + "\n"
                + "</HTML>";

        String textBlock = """
                <HTML>
                    <BODY>
                        Hello World !
                    </BODY>
                </HTML>""";

        out.println(textBlock);
        assertThat(s).isEqualTo(textBlock);
    }
}
