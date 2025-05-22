package com.example.pas_genap_absen5_absen11;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface sportsApi {
    @GET("/api/v1/json/3/search_all_teams.php?l=English%20Premier%20League")
    Call<TimResponse> getPremierLeagueTeams(@Query("id") String league);


}
