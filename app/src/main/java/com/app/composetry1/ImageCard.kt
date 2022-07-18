class ImageCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

    val painter = painterResource(id = R.drawable.nature)
    val desc = "Feel the Nature Image"
    val title = "Feel the Nature"

    Box(modifier = Modifier
        .fillMaxWidth(0.5f)
        .padding(16.dp)){
        ImageCard(
            painter = painter,
            contentDescription = desc,
            title = title
        )
    }

}
    }
}



@Composable
fun ImageCard(
    painter : Painter,
    contentDescription : String,
    title : String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color.Black
                    ),
                    startY = 300f
                ))
            )
            Text(
                text = title,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(12.dp),
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }
}
