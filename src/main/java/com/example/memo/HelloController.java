package com.example.memo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class HelloController {

    public int position = 0;
    public String[] texto = {"Em certo jarro, vivia certa garota. Lugar simples, cheio de portas quadradas e uma mesa no meio. Um homem solteiro, apenas, ocupava o espaço. Ele e a garota, mas esta não era contada nas estatísticas domiciliares.",
            "Poderia preencher um formulário extenso sobre o itens da casa como geladeiras, carros, garagens, ar condicionados e toca DVD's, mas, como garotas em jarros não considerados pelo governo na avaliação socio-econômica, não saberia numerar e, consequentemente, reparar nas garotas em jarros.  ",
            "A garota, tal qual seu jarro, era perceptível pela distorção. Mais especificamente aquela sentimental que gerava quando se tomava algo do recipiente. Uma distorção  que apenas aparelhos muito apurados conseguiriam apontar como não aleatória. Não um pensamento que surgia enquanto a pessoa tomava um suco qualquer e lembrou de algo corriqueiro, ou nem tanto. Mas sim uma influência material da garota.",
            "Um homem, certa vez, enquanto tomava um copo do suco de limão oferecido pelo anfitrião, notou algo estranho surgir no seu peito.", " Algumas mãos dadas lhe vieram na mente e ele sentiu ciúmes. Os ciúmes não eram dele, obviamente, conhecia seu próprio sem qualquer [ilusão. Portanto, por instinto, entrou em forma defensiva e barrou qualquer avanço empático posterior. Risadas falsas. Empolgações genéricas. Colocações neutras. Uma terra arrasada que custaria ao convidado muito tempo para recuperar-se dos danos. E ainda mais para o anfitrião.",
            "Dona das mãos, a pequena nem mais as tinha, perdera-as para a memória, sobrevivia com as partes que o anfitrião não conseguia recordar. Uma colagem tristonha considerando a sua beleza geral. As partes por si eram um sinaleiro apagado do resto.",
            "Um dia a esqueceria, esperançava e temia. Esqueceria porque terminaria de lembrar?"};
    @FXML
    private Label storyLine;

    @FXML
    private Button buttonNext;

    @FXML
    private ImageView imgAnm;

    private VBox vboxG;

    @FXML
    protected void next() {
        if (position <= texto.length - 1) {
            storyLine.setText(texto[position]);
            if(position > 0) {
                String urlImage = new File("src/main/resources/imgs/animacao1_" + position + ".png").toURI().toString();
                Image image = new Image(urlImage);
                imgAnm.setImage(image);
            }
        }
        if(position == texto.length) {
            buttonNext.setText("Fim?");
            String urlMusic = new File("/home/m/Downloads/song_for_my_mom.mp3").toURI().toString();
            MediaPlayer player = new MediaPlayer(new Media(urlMusic));
            player.play();
        }
        position++;
    }

    @FXML
    protected void back() {
        if (position <= texto.length - 1) {
            storyLine.setText(texto[position]);
            String urlImage = new File("src/main/resources/imgs/animacao1_"+(position + 1)+".png").toURI().toString();
            Image image = new Image(urlImage);
            imgAnm.setImage(image);
        }
        if(position == texto.length + 1) {
            buttonNext.setText("Fim?");
            String urlMusic = new File("/home/m/Downloads/song_for_my_mom.mp3").toURI().toString();
            MediaPlayer player = new MediaPlayer(new Media(urlMusic));
            player.play();
        }
        position--;
    }
}