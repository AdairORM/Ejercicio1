package com.example.miprimeraapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio1.R
import com.example.ejercicio1.ui.theme.Ejercicio1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {

            }
        }
    }
}

@Composable
fun Certificado(number:Int,course: String, modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){
        Row ( ) {
            Image(
                painter = painterResource(id = R.drawable.fi_unam_logo), contentDescription = null,
                modifier = modifier.size(90.dp,90.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Image(painter = painterResource(id = R.drawable.unam_logo), contentDescription = null,
                modifier = modifier.size(90.dp,90.dp)

                )

        }

        Column(){
            Text(text = "Adairs Company",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
                )

            Spacer(modifier = modifier.height(80.dp))

            Text(text = "This certificate is presented to:",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
            Spacer(modifier = modifier.height(15.dp))



        }
            Box (            contentAlignment = Alignment.Center
            ){
                Image(painter = painterResource(id = R.drawable.gorro),
                    contentDescription = null,
                    modifier = modifier.fillMaxWidth(),
                    alpha = 0.5F

                )
                Text(text = "Adair Oswaldo Rios Méndez",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Black,
                    textAlign = TextAlign.Center,
                    modifier = modifier.fillMaxWidth()
                )
            }
        Box {

            Text(text = "has completed a $number hours course on",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
            Spacer(modifier = modifier.height(40.dp))


        }
        Box {
            Text(text = "$course",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.firma1), contentDescription = null,
                modifier = modifier.size(50.dp,50.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Image(painter = painterResource(id = R.drawable.firma_2), contentDescription = null,
                modifier = modifier.size(50.dp,50.dp)
            )
        }
        Row {
            Text(text = "Gabriela Díaz")
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Carlos Pérez")

        }

        }
     }



@Composable
@Preview(showBackground = true)
fun CertificadoPreview(){

    Certificado(number = 40, course = "Finance")
}