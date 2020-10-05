package <Your Package Name>;

public class ilk_ekran extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
        setContentView(R.layout.activity_ilk_ekran);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        showDiaglog();
}

 private  void showDiaglog()
    {
    final AlertDialog.Builder builder = new AlertDialog.Builder(ilk_ekran.this);
    ViewGroup viewGroup = findViewById(android.R.id.content);
    View dialogView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);

    remainmeLater = (CardView) dialogView.findViewById(R.id.remainmeLater);
    dontShow = (CardView) dialogView.findViewById(R.id.dontShow);
    rateUs = (CardView) dialogView.findViewById(R.id.rateUs);

    builder.setView(dialogView);
    final AlertDialog alertDialog = builder.create();
    alertDialog.show();


    remainmeLater.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v){
        alertDialog.cancel();
    }
    });
    dontShow.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v){
        sharedPreferences.edit().putInt("rated",1).apply();
        alertDialog.cancel();
    }
    });

    rateUs.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v){
        sharedPreferences.edit().putInt("rated",1).apply();
        Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.kronosapp.sqldersleri");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        alertDialog.cancel();
    }
    });

    }

}
