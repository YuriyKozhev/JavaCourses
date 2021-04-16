package com.yuriy;

public class VideoProcessor {
    private VideoEncoderInterface encoder;
    private VideoDatabaseInterface database;
    private EmailServiceInterface emailService;

    public VideoProcessor(
            VideoEncoderInterface encoder,
            VideoDatabaseInterface database,
            EmailServiceInterface emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process (Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}
