package org.ninjaneers.motager.dashboard.presentation.products.presentation.components
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icons.lucide.Bot
import com.composables.icons.lucide.Lucide
import motager.composeapp.generated.resources.Add_Variant
import motager.composeapp.generated.resources.Add_Variant_button
import motager.composeapp.generated.resources.No_variants
import motager.composeapp.generated.resources.Res
import motager.composeapp.generated.resources.Variant_example
import org.jetbrains.compose.resources.stringResource
import org.ninjaneers.motager.core.presentation.CoreState
import org.ninjaneers.motager.core.presentation.components.PrimaryButton
import org.ninjaneers.motager.core.presentation.components.PrimaryTextField
import org.ninjaneers.motager.core.presentation.theme.FontFamily
import org.ninjaneers.motager.dashboard.presentation.products.presentation.addproduct.AddProductAction
import org.ninjaneers.motager.dashboard.presentation.products.presentation.addproduct.AddProductState
@Composable
fun Step2(
    state: AddProductState,
    coreState: CoreState,
    onAction: (AddProductAction) -> Unit,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
    ){
        Row( modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(Res.string.Add_Variant),
                fontSize = 24.sp,
                fontFamily = FontFamily(
                    weight = FontWeight.Bold,
                    language = coreState.language
                ),
                color = MaterialTheme.colorScheme.onSurface
            )
            Button(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .size(40.dp),
                onClick = {

                },
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.2f),
                    contentColor = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.8f)
                ),
                contentPadding = PaddingValues(0.dp)
            ) {
                Icon(
                    imageVector = Lucide.Bot,
                    contentDescription = "Ai Assistant",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                PrimaryTextField(
                    modifier = Modifier.weight(1f),
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(
                            text = stringResource(Res.string.Variant_example),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.surfaceVariant
                        )
                    }
                )
                PrimaryButton(
                    onClick = {},
                    shape = RoundedCornerShape(6.dp),
                    ) {
                    Text(
                        text = stringResource(Res.string.Add_Variant_button),
                        fontSize = 14.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Medium,
                            language = coreState.language
                        ),
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))

            Box(
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .fillMaxWidth()
                    .height(220.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .border(
                        width = 0.8f.dp,
                        shape = RoundedCornerShape(8.dp),
                        color = (MaterialTheme.colorScheme.outline)
                    )
                    .background(MaterialTheme.colorScheme.background),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(Res.string.No_variants),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal,
                        language = coreState.language
                    ),
                    color = MaterialTheme.colorScheme.surfaceVariant
                )
            }
        }
    }
}