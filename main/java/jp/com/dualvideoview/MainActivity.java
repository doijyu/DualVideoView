package jp.com.dualvideoview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playvideo();
        playvideo2();
    }

    private void playvideo() {
        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        // 動画の指定（mp4の読込み）
        videoView.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.v01));
        // 再生スタート
        videoView.start();
    }
    private void playvideo2() {
        VideoView videoView2 = (VideoView)findViewById(R.id.videoView2);
        // 動画の指定（mp4の読込み）
        videoView2.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.v02));
        // 再生スタート
        videoView2.start();
    }
}