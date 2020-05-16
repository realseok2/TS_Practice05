package com.javaex.ex03;

public class Song {

	private String artist;
	private String title;
	private String album;
	private String composer;
	private int year;
	private int track;

//--------------------------------------------------------------------------------------------------
	// 생성자

	public Song() {
		System.out.println("Song(파라미터 0개)");
	}

	public Song(String artist, String title, String album, String composer, int year) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(파라미터 5개)");
	}

	public Song(String artist, String title, String album, String composer, int year, int track) {
		this(artist, title, album, composer, year);
		this.track = track;
		System.out.println("Song(파라미터 6개)");
	}

}
