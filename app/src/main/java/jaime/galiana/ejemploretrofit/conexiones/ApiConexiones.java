package jaime.galiana.ejemploretrofit.conexiones;

import java.util.ArrayList;

import jaime.galiana.ejemploretrofit.modelos.Album;
import jaime.galiana.ejemploretrofit.modelos.Photo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiConexiones {
    @GET("/albums")
    Call<ArrayList<Album>> getAlbums();

    @GET("/photos?")
    Call<ArrayList<Photo>> getPhotosAlbum(@Query("albumId") int albumId);


}
