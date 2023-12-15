package jaime.galiana.ejemploretrofit.modelos;

import com.google.gson.annotations.SerializedName;

public class Album {
    private int userId;
    private int id;
    @SerializedName(value = "title")
    private String titulo;

    public Album(){}

    public Album(int userId, int id, String titulo) {
        this.userId = userId;
        this.id = id;
        this.titulo = titulo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Album{" +
                "userId=" + userId +
                ", id=" + id +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
