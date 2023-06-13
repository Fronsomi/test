// Generated by view binder compiler. Do not edit!
package com.example.klyuchnik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.klyuchnik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PassLogBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button2;

  @NonNull
  public final EditText editText;

  @NonNull
  public final EditText editText2;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  private PassLogBinding(@NonNull RelativeLayout rootView, @NonNull Button button,
      @NonNull Button button2, @NonNull EditText editText, @NonNull EditText editText2,
      @NonNull TextView textView2, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.button = button;
    this.button2 = button2;
    this.editText = editText;
    this.editText2 = editText2;
    this.textView2 = textView2;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PassLogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PassLogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.pass_log, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PassLogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.editText;
      EditText editText = ViewBindings.findChildViewById(rootView, id);
      if (editText == null) {
        break missingId;
      }

      id = R.id.editText2;
      EditText editText2 = ViewBindings.findChildViewById(rootView, id);
      if (editText2 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new PassLogBinding((RelativeLayout) rootView, button, button2, editText, editText2,
          textView2, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
