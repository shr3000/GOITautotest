package Module7.Task3;

public class GooSearchResult {
    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        String tmp = url.replaceAll("http://", "");
        tmp = tmp.replaceAll("https://", "");
        String[] domein = tmp.split("/");
        return domein[0];
    }
}
