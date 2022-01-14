package qidizi.openAs;

import android.app.*;
import android.os.*;
import android.content.*;
import android.net.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Intent intent = getIntent();
		Uri uri = intent.getData();
		
		if (null == uri)
		{
			Toast.makeText(this, "uri获取失败", Toast.LENGTH_SHORT).show();
			return;
		}

		((EditText)findViewById(R.id.mainEditText)).setText(Uri.decode(uri.getEncodedPath()));
    }
}
