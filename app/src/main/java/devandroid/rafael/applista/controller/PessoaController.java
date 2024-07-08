package devandroid.rafael.applista.controller;

import android.content.SharedPreferences;

import devandroid.rafael.applista.model.Pessoa;
import devandroid.rafael.applista.view.MainActivity;

public class PessoaController {
    private Pessoa pessoa;
    private final SharedPreferences preferences;
    private final SharedPreferences.Editor listaTarefa;

    public PessoaController(MainActivity mainActivity){
        String NOME_PREFERENCES = "pref_lista_tarefa";
        this.preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        this.listaTarefa = preferences.edit();
    }

    public void salvarPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
        listaTarefa.putString("nome", pessoa.getNome());
        listaTarefa.putString("sobrenome", pessoa.getSobrenome());
        listaTarefa.putString("telefone", pessoa.getTelefone());
        listaTarefa.putString("tarefa", pessoa.getTarefa().getTarefa());
        listaTarefa.apply();
    }

    public Pessoa buscarDados(Pessoa pessoa){
        this.pessoa = pessoa;
        pessoa.setNome(preferences.getString("nome", ""));
        pessoa.setSobrenome(preferences.getString("sobrenome", ""));
        pessoa.setTelefone(preferences.getString("telefone", ""));
        pessoa.getTarefa().setTarefa(preferences.getString("tarefa", ""));
        return pessoa;
    }

    public void limparDados(){
        listaTarefa.clear();
        listaTarefa.apply();
    }
}
