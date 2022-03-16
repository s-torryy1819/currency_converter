import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
            writer.write("929.19\n" +
                    "21.1\n" +
                    "7829.9989\n" +
                    "92933.8311127\n" +
                    "395.8209");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            while((line = reader.readLine()) != null){
                writer.write(String.valueOf((Double.parseDouble(line) * 1.10)) + '\n');
                System.out.println(line);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private static void sendHttpGetRequest(double amount) throws IOException {
//        String GET_URL = "https://data.fixer.io/api/latest" + "EUR" + "&symbols=" + "USD";
//        URL url = new URL(GET_URL);
//        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//        httpURLConnection.setRequestMethod("Get");
//        int responseCode = httpURLConnection.getResponseCode();
//        if (responseCode == HttpURLConnection.HTTP_OK) {
//            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//            while ((inputLine = in.readLine()) != null){
//                response.append(inputLine);
//            }
//            in.close();
//        }
//    }
}
