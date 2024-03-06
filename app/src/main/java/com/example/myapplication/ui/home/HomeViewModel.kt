import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.ui.form.FormData

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _formData = MutableLiveData<FormData>()
    val formData: LiveData<FormData> get() = _formData

    fun saveFormData(name: String, email: String) {
        val formData = FormData(name, email)
        _formData.value = formData
    }
}