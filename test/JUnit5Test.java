//import org.junit.jupiter.api.*;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;
//public class JUnit5Test {
//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("BeforeAll Test");
//    }
//    @BeforeEach
//    static void beforeEach(){
//        System.out.println("BeforeEach");
//    }
//
//    @Test
//    @DisplayName("테스트 1☆")
//    static void testing() {
//        System.out.println("testing");
//    }
//
//    @Nested
//    @DisplayName("people")
//    class People {
//        @Nested
//        @DisplayName("man")
//        class Man {
//            @Test
//            static void manTest() {
//                System.out.println("man");
//            }
//        }
//
//        @Nested
//        @DisplayName("woman")
//        class Woman {
//            @Test
//            static void womanTest() {
//                System.out.println("woman");
//            }
//        }
//    }
//
//
//    @ParameterizedTest
//    @ValueSource(ints = {1,2,3,4,5})
//    static void isOdd(int num){
//        assertTrue(Numbers.isOdd(num));
//    }
//
//    @Test
//    static assertAllTest() {
//        int num = 10;
//        assertAll("assertAll test",
//                () -> assertEquals(10,num),
//                () -> assertEquals(13,num+5),
//                () -> assertEquals(15,num+5)
//        );
//    }
//
//    @Test
//    static void assertThrowsTest() {
//        Exception exception = assertThrows(
//                IllegalArgumentException.class, () -> {
//                    throw new IllegalArgumentException("a message");
//                }
//        );
//        assertEquals("message",exception.getMessage());
//    }
//
//    @Test
//    static void assertTimeoutTest() {
//        assertTimeout(ofSeconds(1), () -> {
//            // 1초 이내에 수행해야함
//        });
//    }
//
//    @AfterEach
//    static void afterEach() {
//        System.out.println("AfterEach");
//    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("AfterAll");
//    }
//
//}
