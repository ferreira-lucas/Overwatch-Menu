package lucas.ferreira.overwatchmenu;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;
    private Button btnAna;
    private Button btnBastion;
    private Button btnDoomfist;
    private Button btnDva;
    private Button btnGenji;
    private Button btnHanzo;
    private Button btnJunkrat;
    private Button btnLucio;
    private Button btnMccree;
    private Button btnMei;
    private Button btnMercy;
    private Button btnMoira;
    private Button btnOrisa;
    private Button btnPharah;
    private Button btnReaper;
    private Button btnReinhardt;
    private Button btnRoadhog;
    private Button btnSoldado;
    private Button btnSombra;
    private Button btnSymmetra;
    private Button btnTorbjorn;
    private Button btnTracer;
    private Button btnWidowmaker;
    private Button btnWinston;
    private Button btnZarya;
    private Button btnZenyatta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnAna = findViewById(R.id.ma_btn_ana);
        btnBastion = findViewById(R.id.ma_btn_bastion);
        btnDoomfist = findViewById(R.id.ma_btn_doomfist);
        btnDva = findViewById(R.id.ma_btn_dva);
        btnGenji = findViewById(R.id.ma_btn_genji);
        btnHanzo = findViewById(R.id.ma_btn_hanzo);
        btnJunkrat = findViewById(R.id.ma_btn_junkrat);
        btnLucio = findViewById(R.id.ma_btn_lucio);
        btnMccree = findViewById(R.id.ma_btn_mccree);
        btnMei = findViewById(R.id.ma_btn_mei);
        btnMercy = findViewById(R.id.ma_btn_mercy);
        btnMoira = findViewById(R.id.ma_btn_moira);
        btnOrisa = findViewById(R.id.ma_btn_orisa);
        btnPharah = findViewById(R.id.ma_btn_pharah);
        btnReaper = findViewById(R.id.ma_btn_reaper);
        btnReinhardt = findViewById(R.id.ma_btn_reinhardt);
        btnRoadhog = findViewById(R.id.ma_btn_roadhog);
        btnSoldado = findViewById(R.id.ma_btn_soldado);
        btnSombra = findViewById(R.id.ma_btn_sombra);
        btnSymmetra = findViewById(R.id.ma_btn_symmetra);
        btnTorbjorn = findViewById(R.id.ma_btn_torbjorn);
        btnTracer = findViewById(R.id.ma_btn_tracer);
        btnWidowmaker = findViewById(R.id.ma_btn_widowmaker);
        btnWinston = findViewById(R.id.ma_btn_winston);
        btnZarya = findViewById(R.id.ma_btn_zarya);
        btnZenyatta = findViewById(R.id.ma_btn_zenyatta);

        btnAna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.ana);
            }
        });
        btnBastion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.bastion);
            }
        });
        btnDoomfist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.doomfist);
            }
        });
        btnDva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.dva);
            }
        });
        btnGenji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.genji);
            }
        });
        btnHanzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.hanzo);
            }
        });
        btnJunkrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.junkrat);
            }
        });
        btnLucio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.lucio);
            }
        });
        btnMccree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.mccree);
            }
        });
        btnMei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.mei);
            }
        });
        btnMercy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.mercy);
            }
        });
        btnMoira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.moira);
            }
        });
        btnOrisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.orisa);
            }
        });
        btnPharah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.pharah);
            }
        });
        btnReaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.reaper);
            }
        });
        btnReinhardt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.reinhardt);
            }
        });
        btnRoadhog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.roadhog);
            }
        });
        btnSoldado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.soldado);
            }
        });
        btnSombra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.sombra);
            }
        });
        btnSymmetra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.symmetra);
            }
        });
        btnTorbjorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.torbjorn);
            }
        });
        btnTracer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.tracer);
            }
        });
        btnWidowmaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.widowmaker);
            }
        });
        btnWinston.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.winston);
            }
        });
        btnZarya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.zarya);
            }
        });
        btnZenyatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v,R.raw.zenyatta);
            }
        });
    }//fecha onCreate

    public void play(View v, int som){
        try{
            mp = MediaPlayer.create(MainActivity.this,som);
            mp.start();
        }catch(Exception e){

        }
    }
}//fecha Classe
