package pl.edu.wzsib.nowosci.w.java.java13;

public class TextBlock {
    public static void main(String[] args) {
        String json = """
                {"widget": {
                    "debug": "on",
                    "window": {
                        "title": "Sample Konfabulator Widget",
                        "name": "main_window",
                        "width": 500,
                        "height": 500
                    },
                    "image": {
                        "src": "Images/Sun.png",
                        "name": "sun1",
                        "hOffset": 250,
                        "vOffset": 250,
                        "alignment": "center"
                    },
                    "text": {
                        "data": "Click Here",
                        "size": 36,
                        "style": "bold",
                        "name": "text1",
                        "hOffset": 250,
                        "vOffset": 100,
                        "alignment": "center",
                        "onMouseUp": "sun1.opacity = (sun1.opacity / 100) * 90;"
                    }
                }}
                """;

        System.out.println(json);

        System.out.println("""
                1. Opcja 1
                2. Opcja 2
                3. Exit
                """);
    }
}
