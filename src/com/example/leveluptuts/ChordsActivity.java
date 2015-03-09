package com.example.leveluptuts;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.leveluptuts.R;

public class ChordsActivity extends Activity {
		
	    TextView textOne ;
	    TextView ans ;
	
		Button   Hear_the_chord;
		
	 	Button Do;
	    Button Re;
	    Button Mi;
	    Button Fa;
	    Button Sol;
	    Button La;
	    Button Si;
	    
	    static Integer currnt_note;
	    
	    MediaPlayer intro;
	    MediaPlayer ch_do_note;
	    MediaPlayer ch_re_note;
	    MediaPlayer ch_mi_note;
	    MediaPlayer ch_fa_note;
	    MediaPlayer ch_sol_note;
	    MediaPlayer ch_la_note;
	    MediaPlayer ch_si_note;
	    MediaPlayer apchi;
	    
	    String[] Notes;
	    Random rend ;
	    int rando;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 
        setContentView(R.layout.activity_chords);
        varSet();
        intro.start();
        //choose note
	    rend = new Random();
	    rando = rend.nextInt(2);  //note
        final MediaPlayer[] Notes = {ch_do_note,ch_re_note,ch_mi_note,ch_fa_note,ch_sol_note,ch_la_note,ch_si_note};
        currnt_note=rando;
        //currnt_note=0;
        
        Hear_the_chord.setOnClickListener(new View.OnClickListener() {
        	//int counter=0;
			@Override
			public void onClick(View v) {
				ans.setText("Answer");
				Toast.makeText(getApplicationContext(), "Hear_the_note click works!", Toast.LENGTH_LONG).show();
				if (Notes[currnt_note].isPlaying()){
					Notes[currnt_note].seekTo(0);
				} else 
					Notes[currnt_note].start();		
			}
		});
        
        Do.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (currnt_note==0){
					if (Notes[currnt_note].isPlaying())
						Notes[currnt_note].stop();
					apchi.start();
					ans.setText("Very Good, Hear the Next one");
					Log.d("yessssss!!!","EQEQEQ");	
					rando = rend.nextInt(7); 
					currnt_note=rando;
					
              }
				else{
					Log.d(Notes[currnt_note].toString(),"NOT EQ");	
					ans.setText("Not Good, Try again");
					}
				
			}
		});
        
        Re.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (currnt_note==1){
					if (Notes[currnt_note].isPlaying())
						Notes[currnt_note].stop();
					apchi.start();
					ans.setText("Very Good boy!");
					Log.d("yessssss!!!","EQEQEQ");	
					rando = rend.nextInt(7); 
					currnt_note=rando;
              }
				else{
					Log.d(Notes[currnt_note].toString(),"NOT EQ");	
					ans.setText("Not Good, Try again");
					}
			}
		});
        
        Mi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (currnt_note==2){
					if (Notes[currnt_note].isPlaying())
						Notes[currnt_note].stop();
					apchi.start();
					ans.setText("Well Done, Hear the Next one");
					Log.d("yessssss!!!","EQEQEQ");	
					rando = rend.nextInt(7); 
					currnt_note=rando;
              }
				else{
					Log.d(Notes[currnt_note].toString(),"NOT EQ");	
					ans.setText("Not Good, Try again");
					}
			}
		});
        Fa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (currnt_note==3){
					if (Notes[currnt_note].isPlaying())
						Notes[currnt_note].stop();
					apchi.start();
					ans.setText("OMG! you good ,Hear the Next one");
					Log.d("yessssss!!!","EQEQEQ");	
					rando = rend.nextInt(7); 
					currnt_note=rando;
              }
				else{
					Log.d(Notes[currnt_note].toString(),"NOT EQ");	
					ans.setText("Not Good, Try again");
				}
			}
		});
        Sol.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (currnt_note==4){
					if (Notes[currnt_note].isPlaying())
						Notes[currnt_note].stop();
					apchi.start();
					ans.setText("smart kid! ,Hear the Next one");
					Log.d("yessssss!!!","EQEQEQ");	
					rando = rend.nextInt(7); 
					currnt_note=rando;
              }
				else{
					Log.d(Notes[currnt_note].toString(),"NOT EQ");	
					ans.setText("Not Good, Try again");
					}
			}
		});
        La.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (currnt_note==5){
					if (Notes[currnt_note].isPlaying())
						Notes[currnt_note].stop();
					apchi.start();
					ans.setText("Very Well ,Hear the Next one");
					Log.d("yessssss!!!","EQEQEQ");	
					rando = rend.nextInt(7); 
					currnt_note=rando;
              }
				else{
					Log.d(Notes[currnt_note].toString(),"NOT EQ");	
					ans.setText("Not Good, Try again");
					}
			}
		});
        Si.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (currnt_note==6){
					if (Notes[currnt_note].isPlaying())
						Notes[currnt_note].stop();
					apchi.start();
					ans.setText("Proud of ya ,Hear the Next one");
					Log.d("yessssss!!!","EQEQEQ");	
					rando = rend.nextInt(7); 
					currnt_note=rando;
              }
				else{
					Log.d(Notes[currnt_note].toString(),"NOT EQ");	
					ans.setText("Not Good, Try again");
					}
			}
		});
        
  
        
	}
	
	private void varSet(){
		
			ans = (TextView) findViewById(R.id.textView1);
		 
			Do = (Button) findViewById(R.id.button2);
			Re = (Button) findViewById(R.id.button3);
			Mi = (Button) findViewById(R.id.button4);
			Fa = (Button) findViewById(R.id.button5);
			Sol = (Button) findViewById(R.id.button6);
			La = (Button) findViewById(R.id.button7);
			Si = (Button) findViewById(R.id.button8); 
	        
			Hear_the_chord = (Button) findViewById(R.id.button1);
			apchi = MediaPlayer.create(ChordsActivity.this , R.raw.welldone );
	
			 intro  = MediaPlayer.create(ChordsActivity.this , R.raw.chords_intro);
			ch_do_note = MediaPlayer.create(ChordsActivity.this , R.raw.chord_c );
			ch_re_note = MediaPlayer.create(ChordsActivity.this , R.raw.chord_d );
			ch_mi_note = MediaPlayer.create(ChordsActivity.this , R.raw.chord_e);
			ch_fa_note = MediaPlayer.create(ChordsActivity.this , R.raw.chord_f);
			ch_sol_note = MediaPlayer.create(ChordsActivity.this , R.raw.chord_g);
			ch_la_note = MediaPlayer.create(ChordsActivity.this , R.raw.chord_a);
	        ch_si_note = MediaPlayer.create(ChordsActivity.this , R.raw.chord_b);
	}
}
