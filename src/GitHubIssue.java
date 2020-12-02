import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GitHubIssue {
    //personal token need to secret
    private static final String MY_PERSONAL_TOKEN = "d2c85df1e453bff6f4f7c775818d50a3bd2549e3";
    public static void main(String[] args) throws IOException {
        GitHub github = new GitHubBuilder().withOAuthToken(MY_PERSONAL_TOKEN).build();

        //Repository 연결
        GHRepository repo = github.getRepository("whiteship/live-study");

        //IssueState ALL, OPEN, CLOSED
        List<GHIssue> issues = repo.getIssues(GHIssueState.ALL);
        Map<String,Integer> particpant = new HashMap<>();

        //1-18개 이슈
        for(GHIssue issue : issues){

        }
    }

}
