package com.example.leveluptuts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Random;

import com.example.leveluptuts.R;
import com.facebook.android.DialogError;
import com.facebook.android.Facebook;
import com.facebook.android.Facebook.DialogListener;
import com.facebook.android.FacebookError;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore.Audio.Media;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	String APP_ID;
	//Facebook fb;   //Shya alla
	ImageView pic, log;

    TextView textOne ;
    TextView ans ;
    EditText userPick ;
    
    Button Chords;
    Button Metallica;
    
    Button   Hear_the_note;
    
    
    Button Do;
    Button Re;
    Button Mi;
    Button Fa;
    Button Sol;
    Button La;
    Button Si;
    static Integer currnt_note;
    
    MediaPlayer do_note;
    MediaPlayer re_note;
    MediaPlayer mi_note;
    MediaPlayer fa_note;
    MediaPlayer sol_note;
    MediaPlayer la_note;
    MediaPlayer si_note;
    
    
    
    MediaPlayer apchi;
    MediaPlayer ptahDavar;
    String[] Notes;
    Random rend ;
    int rando;
    static Integer inRow;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        setContentView(R.layout.activity_main);
        varSet();
       
        
        
        
        
        ptahDavar.start();
        
        
        //updateButtonImage();
       
        
        
        //choose note
	    rend = new Random();
	    rando = rend.nextInt(2);  //note
        final MediaPlayer[] Notes = {do_note,re_note,mi_note,fa_note,sol_note,la_note,si_note};
        currnt_note=rando;
        //currnt_note=0;
        
        Hear_the_note.setOnClickListener(new View.OnClickListener() {
        	//int counter=0;
			@Override
			public void onClick(View v) {
				ans.setText("Answer");
			//	Toast.makeText(getApplicationContext(), "Hear_the_note click works!", Toast.LENGTH_LONG).show();
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
        //************************************
        //********* NEW ACTIVITIES *********** 
        //************************************
        
        Chords.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("com.example.leveluptuts.ChordsActivity"));
				
			}
		});
        
        Metallica.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("com.example.leveluptuts.Metalactivity"));
				
			}
		});
        
    
    }
        
        
        /*
        //Facebook
        log.setOnClickListener(new View.OnClickListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				if (fb.isSessionValid()){
					try {
						fb.logout(getApplicationContext());
						updateButtonImage();
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					fb.authorize(MainActivity.this, new DialogListener() {
						
						@Override
						public void onFacebookError(FacebookError e) {
							Toast.makeText(MainActivity.this, "onFacebookError", Toast.LENGTH_SHORT).show();
							
						}
						
						@Override
						public void onError(DialogError e) {
							Toast.makeText(MainActivity.this, "onError", Toast.LENGTH_SHORT).show();
							
						}
						
						@Override
						public void onComplete(Bundle values) {
							updateButtonImage();
							
						}
						
						@Override
						public void onCancel() {
							Toast.makeText(MainActivity.this, "on cancel", Toast.LENGTH_SHORT).show();
							
						}
					});
				}
				
			}
		});
        
        
    }
    @SuppressWarnings("deprecation")
	private void updateButtonImage() {
		if (fb.isSessionValid()){
			log.setImageResource(R.drawable.com_facebook_button_check_off);}
			else{
				log.setImageResource(R.drawable.com_facebook_logo);
			}
		}
		
	
	@SuppressWarnings("deprecation")
	private void varSet(){
    	//######FACEBOOK#########
    	APP_ID=getString(R.string.APP_ID);
    	fb = new Facebook(APP_ID);
    	//#######################
    	*/
    	
    	//log = (ImageView) findViewById(R.id.login);
    //	pic = (ImageView) findViewById(R.id.picture_pic);
        
        private void varSet() {
    		// TODO Auto-generated method stub
    	 
        textOne = (TextView) findViewById(R.id.textView1);
        ans = (TextView) findViewById(R.id.textView2);
        
        Hear_the_note = (Button) findViewById(R.id.button1);
        
        Chords = (Button) findViewById(R.id.button9);
        Metallica = (Button) findViewById(R.id.button10);
        
        Do = (Button) findViewById(R.id.button2);
        Re = (Button) findViewById(R.id.button3);
        Mi = (Button) findViewById(R.id.button4);
        Fa = (Button) findViewById(R.id.button5);
        Sol = (Button) findViewById(R.id.button6);
        La = (Button) findViewById(R.id.button7);
        Si = (Button) findViewById(R.id.button8);
        
        apchi = MediaPlayer.create(MainActivity.this , R.raw.welldone );
        ptahDavar = MediaPlayer.create(MainActivity.this , R.raw.oncreatesound );
        
      
        
        do_note = MediaPlayer.create(MainActivity.this , R.raw.guitar_c );
        re_note = MediaPlayer.create(MainActivity.this , R.raw.guitar_d );
        mi_note = MediaPlayer.create(MainActivity.this , R.raw.guitar_e);
        fa_note = MediaPlayer.create(MainActivity.this , R.raw.guitar_f);
        sol_note = MediaPlayer.create(MainActivity.this , R.raw.guitar_g);
        la_note = MediaPlayer.create(MainActivity.this , R.raw.guitar_a);
        si_note = MediaPlayer.create(MainActivity.this , R.raw.guitar_b);
       
    


		
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
