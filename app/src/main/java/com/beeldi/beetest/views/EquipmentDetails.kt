package com.beeldi.beetest.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.beeldi.beetest.R
import com.beeldi.beetest.tools.Equipment
import com.beeldi.beetest.ui.theme.BeeTestTheme
import com.beeldi.beetest.viewModels.EquipmentDetailsViewModel

class EquipmentDetails : ComponentActivity() {
    private lateinit var equipment : EquipmentDetailsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        init()
        setContent {
            BeeTestTheme {
                Scaffold(
                    topBar = {
                         ReturnBar()
                    },
                    content = { innerPadding ->
                        EquipmentDetail(
                            id = equipment.getId(),
                            name = equipment.getName(),
                            type = equipment.getType(),
                            modifier = Modifier.padding(innerPadding)
                        )
                    },
                    bottomBar = {

                    }

                )
            }
        }
    }
    fun init(){
        //On récupère les informations de l'équipement
        val id = intent.getStringExtra("equipment_id")?.toInt() ?: 0
        val type = intent.getStringExtra("equipment_type").toString()
        val name = intent.getStringExtra("equipment_name").toString()
        val eq = Equipment(id,name,type)
        this.equipment = EquipmentDetailsViewModel(eq)
    }
    @Composable
    fun EquipmentDetail(id : Int,name : String, type : String,modifier: Modifier = Modifier) {
        Column(
            horizontalAlignment =  Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxSize()
                .background(color = Color.LightGray)
                .offset(0.dp, (-100).dp)
        ) {
            Text(
                text = "Equipment name :\n\n$name",
                color = Color.White,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Monospace,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color(0,0,0,255),
                        blurRadius = 8f
                    )
                ),
                modifier = modifier
                    .background(color = Color(33 ,150 ,243))
            )
            Text(
                text = "Equipment type :\n\n$type",
                color = Color.White,
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color(0,0,0,255),
                        blurRadius = 8f
                    )
                ),
                modifier = modifier
                    .background(color = Color(33 ,150 ,243))
            )
        }


    }
    @Preview(showBackground = true)
    @Composable
    private fun EquipmentDetailPreview() {
        BeeTestTheme {
            EquipmentDetail(1,"Sword","Weapon")
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ReturnBar(modifier: Modifier = Modifier) {
        TopAppBar(
            title = { Text(text = "Détails de l'équipement") },
            navigationIcon = {
                IconButton(onClick = { finish() }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Retour")
                }
            }
        )
    }
    @Preview(showBackground = true)
    @Composable
    private fun returnBarPreview() {
        BeeTestTheme {
            ReturnBar()
        }
    }

}