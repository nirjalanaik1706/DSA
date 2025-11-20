#include "shelf.cpp"
class FileManager
{
public:
    bool serialize(Shelf theshelf)i
    {
        bool status = false;
        ofstream outfile("shelf.txt");
        if (outfile.is_open())
        {
            for (int i = 0; i <= theshelf.top; i++)
            {
                theshelf.book[i].serialize(outfile);
                status = true;
            }
            outfile.close();
            cout << "successfull save " << endl;
        }
        else
        {
            cout << "something wrong" << endl;
        }

        return status;
    }

    Shelf loadFromFile()
    {
        Book book;
        Shelf theshelf;
        ifstream in("shelf.txt");
        string line;
        while (getline(in, line))
        {
            if (!line.empty())
                theshelf.push(book.deserialize(line));
        }
        return theshelf;
    }
};
