package garcia.luis.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var bundle = intent.extras
        if (bundle != null) {
            var name = bundle.getString("name")
            var email = bundle.getString("email")

            tv_nombre.text = name
            tv_email.text = email
        }

        btn_cerrar.setOnClickListener {
            finish()
        }
    }
}