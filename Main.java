import java.util.ArrayList;
import search.MagicSearch;
import search.SearchContext;
import search.User;



class Main {
    static void pritnResult(ArrayList<SearchContext> resultFromSearch, String searchKey) {
        System.out.println("===========================");
        System.out.println("Keyword : " + searchKey);
        System.out.println("===========================");
        if(resultFromSearch.size() == 0) {
            System.out.println("----------------------");
            System.out.println("No Data Found");
            System.out.println("----------------------");
            } else{
            for( SearchContext context : resultFromSearch) {
                System.out.println("Data Found :" + context.user.nim + "-" + context.user.name + "-" + context.user.address + "-" + "Data nomor" + (context.index + 1));
                System.out.println("----------------------");
            }
        }
    }



  public static void main(String[] args) {
        MagicSearch search = new MagicSearch();

        search.addSeed(new User("Andri Hariadi", "1102021", "BANDUNG"));
        search.addSeed(new User("Dewi Lestari", "1102022", "SURABAYA"));
        search.addSeed(new User("Dewi Agustin", "1102023", "MALANG"));
        search.addSeed(new User("Reni Indrayanti", "1102024", "MALANG"));
        search.addSeed(new User("Toni Sukmawan", "1102025", "SURABAYA"));
        search.addSeed(new User("Toni Gunawan", "1102026", "BANDUNG"));


        // pencarian Data Found
        String searchKey = "Toni";
        ArrayList<SearchContext> strictSearchResult = search.strictSearch(searchKey);
        pritnResult(strictSearchResult, searchKey);

        // pencarian No Data Found
        String fakeSearchKey = "Rudi";
        ArrayList<SearchContext> strictSearchResultNo = search.strictSearch(fakeSearchKey);
        pritnResult(strictSearchResultNo, fakeSearchKey);
  }
}