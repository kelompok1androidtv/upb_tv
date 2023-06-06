package com.satria.universitaspelitabangsatv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String Menu[] = {
            "Beranda",
            "Tentang Universitas Pelita Bangsa",
            "Fakultas",
            "Prodi",
            "Fasilitas",
            "Organisasi",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Profil Singkat",
                "Visi Misi",
                "Latar Belakang UPB",
                "Tentang UPB",
                "Sosial Media",
                "Fakultas",
                "Prodi",
                "Struktur Orgnanisasi",
                "Fasilitas dan Sarpras"
        };

        String description = "Fusce id nisi turpis. Praesent viverra bibendum semper. "
                + "Donec tristique, orci sed semper lacinia, quam erat rhoncus massa, non congue tellus est "
                + "quis tellus. Sed mollis orci venenatis quam scelerisque accumsan. Curabitur a massa sit "
                + "amet mi accumsan mollis sed et magna. Vivamus sed aliquam risus. Nulla eget dolor in elit "
                + "facilisis mattis. Ut aliquet luctus lacus. Phasellus nec commodo erat. Praesent tempus id "
                + "lectus ac scelerisque. Maecenas pretium cursus lectus id volutpat.";
        String studio[] = {
                "Studio Zero", "Studio One", "Studio Two", "Studio Three", "Studio Four", "Studio Five", "Studio Six", "Studio Seven", "Studio Eight",
        };
        String videoUrl[] = {
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4"
        };
        String bgImageUrl[] = {
                "https://i.ytimg.com/vi/G1XdKnQn0MA/maxresdefault.jpg",
                "https://i.ytimg.com/vi/G1XdKnQn0MA/maxresdefault.jpg",
                "https://i.ytimg.com/vi/G1XdKnQn0MA/maxresdefault.jpg",
                "https://i.ytimg.com/vi/G1XdKnQn0MA/maxresdefault.jpg",
                "https://i.ytimg.com/vi/G1XdKnQn0MA/maxresdefault.jpg",
                "https://i.ytimg.com/vi/G1XdKnQn0MA/maxresdefault.jpg",
                "https://i.ytimg.com/vi/G1XdKnQn0MA/maxresdefault.jpg",
                "https://i.ytimg.com/vi/G1XdKnQn0MA/maxresdefault.jpg",
                "https://i.ytimg.com/vi/G1XdKnQn0MA/maxresdefault.jpg",
        };
        String cardImageUrl[] = {
                "https://yt3.googleusercontent.com/ytc/AGIKgqPXB0I5JOfUEcZf4x-ExRdbwTnGv6Nwstj3PBVWRQ=s900-c-k-c0x00ffffff-no-rj",
                "https://disparpora.sambas.go.id/wp-content/uploads/2021/02/visi-misi.png",
                "https://saintif.com/wp-content/uploads/2020/06/Contoh-latar-belakang-proposal-1024x754.png",
                "https://jurnalindonesiabaru.com/wp-content/uploads/2018/12/squareblur_201812921573243-155026879.jpg",
                "https://cdn-icons-png.flaticon.com/512/4187/4187272.png",
                "https://assets.universitas123.com/images/109/Kampus%20Pelita%20Bangsa%20Cikarang%20dan%20Fakultas%20Terbaiknya.jpg",
                "https://www.pelitabangsa.ac.id/wp-content/uploads/2020/05/WhatsApp-Image-2020-05-17-at-9.18.26-PM-300x183.jpeg",
                "https://www.pelitabangsa.ac.id/wp-content/uploads/2021/09/WhatsApp-Image-2021-08-31-at-13.21.33.jpeg",
                "https://fai.pelitabangsa.ac.id/wp-content/uploads/2021/05/Eskalator-Kampus-1024x768.jpg"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}