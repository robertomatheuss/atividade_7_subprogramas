import Data.List

-- Definição de tipos
type Evento = String
type Agenda = [Evento]

apresentaAlternativas :: IO()
apresentaAlternativas = do
    putStrLn "\nSelecione uma opção:"
    putStrLn "1. Adicionar evento"
    putStrLn "2. Remover evento"
    putStrLn "3. Visualizar agenda"
    putStrLn "4. Sair"

adicionaEvento :: Agenda -> IO()
adicionaEvento agenda = do
    putStrLn "Digite o evento a ser adicionado:"
    evento <- getLine
    let novaAgenda = agenda ++ [evento]
    loop novaAgenda

removeEvento:: Agenda -> IO()
removeEvento agenda = do
    putStrLn "Digite o índice do evento a ser removido:"
    indice <- getLine
    let novaAgenda = delete (agenda !! (read indice-1)) agenda                
    loop novaAgenda

apresentaEventos ::Agenda -> IO()
apresentaEventos agenda = do
    putStrLn "Eventos na Agenda:"
    mapM_ putStrLn agenda
    loop agenda


-- Função de loop para interação com o usuário
loop :: Agenda -> IO ()
loop agenda = do
    apresentaAlternativas
    opcao <- getLine
    case opcao of
        "1" -> adicionaEvento agenda
        "2" -> removeEvento agenda
        "3" -> apresentaEventos agenda
        "4" -> putStrLn "Saindo do programa..."
        _   -> do
            putStrLn "Opção inválida. Tente novamente."
            loop agenda

-- Função principal
main :: IO ()
main = do
    putStrLn "Bem-vindo ao Gerenciador de Agenda!"
    loop []