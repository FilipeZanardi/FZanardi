public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btLimpar = (Button) findViewById(R.id.btLimpar);
        btLimpar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView) findViewById(R.id.editAltura);
                TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
                TextView tvDescricao = (TextView) findViewById(R.id.tvDescricao);


                editPeso.setText("");
                editAltura.setText("");
                tvResultado.setText("");
                tvDescricao.setText("");


            }
        });


        final float[] imc = new float[1];
        Button btCalcular = (Button) findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView) findViewById(R.id.editAltura);
                TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
                TextView tvDescricao = (TextView) findViewById(R.id.tvDescricao);

                int peso = Integer.parseInt(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                imc[0] = peso / (altura * altura);
                if (imc[0] < 17) {
                    tvResultado.setText(imc[0] + "");
                    tvDescricao.setText("Muito Abaixo do Texto");
                } else {
                    if (imc[0] < 18.49) {
                        tvResultado.setText(imc[0] + "");
                        tvDescricao.setText("Abaixo do Texto");
                    } else {
                        if (imc[0] < 24.99) {
                            tvResultado.setText(imc[0] + "");
                            tvDescricao.setText("Peso Normal");
                        } else {
                            if (imc[0] < 29.99) {
                                tvResultado.setText(imc[0] + "");
                                tvDescricao.setText("Acima do Peso");
                            } else {

                                if (imc[0] < 34.99) {
                                    tvResultado.setText(imc[0] + "");
                                    tvDescricao.setText("Obesidade 1");
                                } else {
                                    if (imc[0] < 39.99) {
                                        tvResultado.setText(imc[0] + "");
                                        tvDescricao.setText("Obesidade 2(severa");
                                    } else {
                                        tvResultado.setText(imc[0] + "");
                                        tvDescricao.setText("Obesidade 2(severa");

                                    }
                                }
                            }

                        }

                    }
                }
            }
        });
    }
}
