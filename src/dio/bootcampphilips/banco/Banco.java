package dio.bootcampphilips.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {
	
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public Optional<Conta> getContasByNumero(int numero) {
        for (Conta c : contas) {
            if (c.getNumero() == numero) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    public List<Conta> getContasBySaldo(double saldo) {
        List<Conta> salContas = new ArrayList<Conta>();
        for (Conta c : contas) {
            if (c.getSaldo() >= saldo) {
                salContas.add(c);
            }
        }
        return salContas;
    }
}
