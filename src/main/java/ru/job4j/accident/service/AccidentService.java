package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentMem;

import java.util.Collection;
import java.util.Objects;

/**
 * описывающий логику работы.
 * -@Service для классов с бизнес логикой
 * 2. IndexControl. Таблица и вид. [#2092 #235642]
 * Уровень : 3. МидлКатегория : 3.4. SpringТопик : 3.4.2. MVC
 * 4. Form с композиционным объектом [#305522]
 * Уровень : 3. МидлКатегория : 3.4. SpringТопик : 3.4.2. MVC
 */
@Service
public class AccidentService implements AccidentServiceInterface {

    private AccidentMem accidentMem;

    public AccidentService(AccidentMem accidentMem) {
        this.accidentMem = accidentMem;
    }

    /**
     * производит запись new Accident в Репозиторий или обновление существующией записи
     *
     * @param accident Object
     * @return Accident Object
     */
    @Override
    public Accident create(Accident accident) {
        return accidentMem.create(accident);
    }

    /**
     * @return возвращает коллекцию значнией
     */
    @Override
    public Collection<Accident> getAll() {
        return accidentMem.getAll();
    }

    /**
     * поиск Accident по id, id in this case is key
     */
    @Override
    public Accident findById(int id) {
        return accidentMem.get(id);
    }
}
