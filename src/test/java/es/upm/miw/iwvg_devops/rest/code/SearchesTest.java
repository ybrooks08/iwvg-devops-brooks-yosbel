package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Searches;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    @Test
    void testFindUserIdBySomeProperFraction() {
        assertEquals(List.of("1"), new Searches().findUserIdBySomeProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void tesFindUserIdByAllProperFraction() {
        assertEquals(List.of("1", "2", "3", "5"), new Searches().findUserIdByAllProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void tesFindDecimalImproperFractionByUserName() {
        assertEquals(List.of(2.0, -0.5), new Searches().findDecimalImproperFractionByUserName("Oscar")
                .collect(Collectors.toList()));
    }
}
